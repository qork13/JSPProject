<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Celsius to Farenheit</title>
</head>
<body>
<!-- Take Celsius input from text field and submit to getCelsius servlet -->
<h1>Celsius to Farenheit Converter</h1>
<form action="getCelsiusServlet" method="post">
Enter the degrees Celsius in a decimal number:
<input type="text" name="userCelsius" size="10">
<input type="submit" value="Calculate Celsius"/>
</form>
</body>
</html>