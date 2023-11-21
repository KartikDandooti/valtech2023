<%@page import="com.valtech.training.assignmentHib.model.EmployeeModel"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
	<%
	List<EmployeeModel> employees = (List<EmployeeModel>) request.getAttribute("employee");
	%>

	<table border="1" width="30%" height="30%">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Age</th>
			<th>Exeprience</th>
			<th>Seniority</th>
			<th>Salary</th>
			<th>Department</th>
		</tr>
		<%
		for (EmployeeModel emp : employees) {
			request.setAttribute("emp", emp);
			/* for jstl setAttribute has to be used  */
		%>
		<tr>
			<td>${emp.id}</td>
			<td>${emp.name}</td>
			<td>${emp.age}</td>
			<td>${emp.experience}</td>
			<td>${emp.seniority}</td>
			<td>${emp.salary}</td>
			<td>${emp.department.deptId}</td>
		</tr>
		<%
		}
		%>
		<tfoot>
			<td colspan="5" align="right">
				<form action="list" method="get">
					<input type="submit" name="submit" value="Back To Department" />

				</form>
			</td>
		</tfoot>
	
</body>
</html>