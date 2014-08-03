<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html> 
 <body bgcolor="white"> 
 
 <jsp:useBean id="clock" class="java.util.Date" /> 
 <c:choose> 
	 <c:when test="${clock.hours < 12}"> 
	 	<h1>Good morning!</h1> 
	 </c:when> 
	 <c:when test="${clock.hours < 18}"> 
	 	<h1>Good day!</h1> 
	 </c:when> 
	 <c:otherwise> 
	 	<h1>Good evening!</h1> 
	 </c:otherwise> 
 </c:choose> 
 Welcome to our site, open 24 hours a day. 
 </body> 
</html>