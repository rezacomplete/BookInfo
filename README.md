# BookInfo
book information microservice

This code is written with Java 8 and spring boot. <br>
Please run: <br/>
<b>docker build -t book-info .</b> <br/>
<b>docker run -p 8081:8081 -t book-info</b> <br/>
You can retrieve book information by calling the Rest API like below:<br>
<b>http://localhost:8081/books/1 </b> <br>
You can access the swagger from the postman using:<br>
<b>http://localhost:8081/v2/api-docs </b> <br>
You can access the swagger UI from the browser using:<br>
<b>http://localhost:8081/swagger-ui.html </b> <br>