<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

We have reached the list of future customers !!! 

<table>
	<tr>
		<th>Name</th>
		<th>Surname</th>
		<th>Email</th>
	</tr>
	<c:forEach items="${customers}" var="customer">
		<tr>
			<td>${customer.name}</td>
			<td>${customer.surname}</td>
			<td>${customer.email}</td>
		</tr>
	</c:forEach>
</table>

</body>
</html>