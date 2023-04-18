<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body>
    <h2>Book Details</h2>
    <form action="book">
       Book Id :  <input type="text" name="id"> <br> <br>
        <input type="submit">
    </form>
	<hr>
	Book Id : ${book.bookId} <br>
	Book Name : ${book.bookName} <br>
	Book Prize : ${book.bookPrize} <br>
</body>
</html>