<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Farenheit Conversion Result</title>
</head>
<!-- Display Farenheit results -->
<body>
<p> There are ${userFarenheit.getCelsius()} degrees C in ${userFarenheit.getTemp()} degrees F. </p></br>
<!-- Links to the initial landing page or to switch over to Celsius to Farenheit -->
<a href="ctof.jsp">Celsius to Farenheit</a><br>
<a href="ftoc.jsp">Do another Farenheit to Celsius conversion</a>
<a href="index.jsp">Back to home</a>
</body>
</html>