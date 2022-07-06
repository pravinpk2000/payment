<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="d"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
</head>
<body>

	<div class="container-fluid">
		<div class="row">
		<div class="col-md-4"></div>
			<div class="col-md-3" >

				<div align="center">
					<h1 style="background-color: gray; display: inline;">Add
						payment Details</h1>
						</div>

					<div>

						<p style="color: green">
							<d:out value="${message}"></d:out>
						</p>


					</div>


					<form action="add" method="post">
						<div class="form-group" >
							<label for="acnumber" style="font-size: 2.0em;">Account Number</label><input type="text"
								name="accountNumber" id="acnumber" class="form-control" />
						</div>
						<div class="form-group">
							<label for="name" style="font-size: 2.0em;">Customer Name</label><input type="text"
								name="customerName" id="name"  class="form-control"/>
						</div>
						<div class="form-group">
							<label for="date" style="font-size: 2.0em;">Date of payment</label><input type="date"
								name="paymentDate" id="date" class="form-control" />
						</div>
						<div class="form-group" style="font-size: 2.0em;"> 
							<label for="paidamount">Amount</label><input type="text"
								name="amount" id="paidamount" class="form-control"/>
						</div>
						<div class="form-group">
							<input type="submit" value="AddDetails" class="btn btn-success" /> <input type="reset"
								value="clear" class="btn btn-danger" />
						</div>
					</form>
					<a href="home.jsp">Back to Home</a>
				</div>
				<div class="col-md-5"></div>
			</div>
		</div>
		
		
</body>
</html>