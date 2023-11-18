<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>result</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>Id</th>
			<th>Code</th>
			<th>Name</th>
			<th>Type</th>
			<th>Delete</th>
			<th>Update</th>
		</tr>
		<c:forEach items="${locations }" var="location">
			<tr>
				<td>${location.id}</td>
				<td>${location.code}</td>
				<td>${location.name}</td>
				<td>${location.type}</td>
				<td><a href="delete?id=${location.id}">delete</a></td>
				<td><a href="update?id=${location.id}">update</a></td>

			</tr>
		</c:forEach>

	</table>
	<a href="showLocation">Click to add new location</a>
</body>
</html>