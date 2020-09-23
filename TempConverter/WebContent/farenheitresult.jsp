<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Farenheit Conversion Result</title>
</head>
<body>
<p> There are ${userFarenheit.getCelsius()} degrees C in ${userFarenheit.getTemp()} degrees F. </p></br>
<a href="ftoc.jsp">Celsius to Farenheit</a><br>
<a href="index.jsp">Back to Landing Page</a>
</body>
</html>