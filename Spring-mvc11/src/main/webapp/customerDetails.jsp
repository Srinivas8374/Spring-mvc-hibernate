<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Customer Details</h1>
	<h3>${customer.getId()}</h3>
	<h3>${customer.getName()}</h3>
	<h3>${customer.getEmail()}</h3>
	<h3>${customer.getVisitedDate()}</h3>
	<h3>${customer.getTotalExp()}</h3>
	<h3>${visitor}</h3>
</body>
</html>