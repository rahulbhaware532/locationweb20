<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>save</title>
</head>
<body style ="text-align:center">
	<h2>Save Location</h2>
	<form action="saveLocation" method="post">
	<pre>
		id<input type="text" name="id" /> <br>
		code<input type="text" name="code" /><br>
		name<input type="text" name="name" /> <br>
		urban<input type="radio" value="urban" name="type" />  rural<input type="radio" value="rural" name="type" />
		
			<input type="submit" value="save" />
</pre>

	</form>
	${msg}
	<a href="http://localhost:9090/searchLocation">Search Location By Id</a><br/>
	<a href="getLocations">Search All Locations</a>
</body>
</html>