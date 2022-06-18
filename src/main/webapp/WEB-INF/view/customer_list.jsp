<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
										<!-- url del proyecto -> "${pageContext.request.contextPath}" -->
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/styles.css "/>

</head>
<body>

We have reached the list of future customers !!! 
<h1>Customer List</h1>
<table border="1">
	<tr>
		<th>Name</th>
		<th>Surname</th>
		<th>Email</th>
		
		<th>Modify</th>
	</tr>
	<c:forEach var="customer" items="${customers}">
	
		<c:url var="updateLink" value="/customer/showUpdateForm">
			<c:param name="customerId" value="${customer.id }"/>
		</c:url>
		<tr>
			<td>${customer.name}</td>
			<td>${customer.surname}</td>
			<td>${customer.email}</td>
			
			<td><a href="${updateLink }"><input type="button" value="Modify"/></a></td>
		</tr>
	</c:forEach>
</table>
<br>
<!-- 1º vamos a formulario para agregar -->
<input type="button" value="Agregate Customer" onclick="window.location.href='showAggregateForm';return false; "/>
</body>
</html>