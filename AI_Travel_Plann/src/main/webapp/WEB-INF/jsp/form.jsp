<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="generateTrip" method="post">
<input type="text" placeholder="Enter location" name="location"/>
<input type="text" placeholder="Enter days" name="days"/>
<input type="text" placeholder="Enter buget" name="buget"/>
<input type="text" placeholder="Enter how many people" name="people"/>
<input type="text" placeholder="Enter who was travelling with you" name="partner"/>
<button type="submit">submit</button>
</form>
</body>
</html>