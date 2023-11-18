<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>update</title>
</head>
<body>
	<h2>Update Location Info</h2>
	<form action="updateLoc" method="post">
		<pre>
		id<input type="text" name="id" value="${location.id }" readonly /> <br>
		code<input type="text" name="code" value="${location.code }" /><br>
		name<input type="text" name="name" value="${location.name }" /> <br>
		urban<input type="radio" value="urban" name="type" />  rural<input
				type="radio" value="rural" name="type" />
		
			<input type="submit" value="update" />
</pre>

	</form>

</body>
</html>