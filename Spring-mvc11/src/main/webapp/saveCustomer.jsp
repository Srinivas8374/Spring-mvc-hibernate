<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	customer
	<form action="customer" method="post">
		ID<input type="text" name="id"><br>
		Name<input type="text" name="name"><br>
		Email<input type="text" name="email"><br>
		Visited Date<input type="text" name="visitedDate"><br>
		Total Expenditure<input type="text" name="totalExp"><br>
		<input type="submit">
	</form>
	visitor
	<form action="visitor" method="post">
		ID<input type="text" name="id"><br>
		Name<input type="text" name="name"><br>
		Email<input type="text" name="email"><br>
		Adress<input type="text" name="add"><br>
		<input type="submit">
	</form>
</body>
</html>