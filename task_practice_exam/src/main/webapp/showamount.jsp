<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="d"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
	<tr>
		<td>Account Number</td>
		<td>Customer Name</td>
		<td>Date of payment</td>
		<td>Amount</td>
		
	</tr>
	
	<tr>
<td><d:out value="${added.accountNumber}"/></td>
<td><d:out value="${added.customerName}"/></td>
<td><d:out value="${added.paymentDate}"/></td>
<td><d:out value="${added.amount}"/></td>
</tr>
</table>
</body>
</html>