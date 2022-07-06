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
<body>

<div>

		<p style="color: green">
			<d:out value="${message}"></d:out>
		</p>


	</div>


<table border="1" style="align-content: center;" >
	<tr>
		<td>Account Number</td>
		<td>Customer Name</td>
		<td>Date of payment</td>
		<td>Amount</td>
		
	</tr>


<d:forEach items="${added}" var="eachpayment">
<tr>
<td><d:out value="${eachpayment.accountNumber}"/></td>
<td><d:out value="${eachpayment.customerName}"/></td>
<td><d:out value="${eachpayment.paymentDate}"/></td>
<td><d:out value="${eachpayment.amount}"/></td>
</tr>
</d:forEach>
</table>

<a href="add.jsp">more add</a>
<a href="byName.jsp">view_name</a>
<a href="byamount.jsp">view_amount</a>
</body>
</html>