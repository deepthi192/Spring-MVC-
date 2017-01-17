<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>
	<title>Spring MVC</title>
	<style>
	body {background:#4FA2AD;}
	table {
    border-collapse: collapse;
    width: 100%;
	}

th, td {
    text-align: left;
    padding: 10px;
}

tr:nth-child(even){background-color: #7D788E}
	</style>
</head>

<body >
	<h1> Employee Details</h1>
	<h3>The table below gives the details of the employees in the database</h3>

	<table border="1">
		<tr>
			<th>Employee Id</th>
			<th>First Name</th>
			<th>Last Name</th>
		</tr>
		<c:forEach items="${employees}" var="employee">
			<tr>
				<td>${employee.id}</td>
				<td>${employee.firstName}</td>
				<td>${employee.lastName}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>