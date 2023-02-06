<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculator</title>
</head>
<body>
	<form action="result" method="GET">
<input type="number" name="num_one">
<input type="number" name="num_two">
<input type="radio" name="operation" value="plus">Plus
<input type="radio" name="operation" value="minus">Minus
<input type="radio" name="operation" value="multiply">Multiply
<input type="radio" name="operation" value="divide">Divide
<input type="submit" value="submit" name="submit">
	</form>
</body>
</html>