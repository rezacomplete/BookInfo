package com.rezacomplete.controller;

import com.rezacomplete.BookInfoApplication;
import com.rezacomplete.model.BookInfo;
import com.rezacomplete.service.BooksInfoService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BookInfoApplication.class)
@WebAppConfiguration
public class BooksInfoResourceTest {

    private MockMvc mockMvc;

    @MockBean
    private BooksInfoService booksInfoService;

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Before
    public void setUp() throws Exception {
        this.mockMvc = webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void retrieveBookInfo() throws Exception {
        BookInfo response = new BookInfo();
        response.setName("book1");
        response.setBookId("1");

        when(booksInfoService.retrieveBookInfo("1")).thenReturn(response);

        mockMvc.perform(get("/books/1"))
                .andExpect(status().isOk())
                .andExpect(content().string("{\"bookId\":\"1\",\"name\":\"book1\"}"))
                .andExpect(content().contentType("application/json;charset=UTF-8"));
    }
}