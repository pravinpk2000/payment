<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="d"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css">
a {
	font-size: 1.5em;
	
}

h1 {
	font-size: 3.5em;
	margin-left: 500px;
}

#arivand {

	color: gold;
}

#center{

        margin-left:600px;
}
</style>
</head>
<body>

	<h1 id="arivand">
		<d:out  value="${message}"></d:out>
	</h1>


	<a id="center" href="add.jsp">Add Details</a>

</body>
</html>