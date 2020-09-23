<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Farenheit to Celsius</title>
</head>
<body>
<h1>Farenheit to Celsius Converter</h1>
<form action="getFarenheitServlet" method="post">
Enter the degrees Farenheit in a decimal number:
<input type="text" name="userFarenheit" size="10">
<input type="submit" value="Calculate Farenheit"/>
</form>
</body>
</html>