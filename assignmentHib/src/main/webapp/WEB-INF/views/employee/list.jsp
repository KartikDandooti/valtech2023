<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@page import="com.valtech.training.assignmentHib.model.EmployeeModel"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>List of employee</h1>
	<%
	List<EmployeeModel> employee = (List<EmployeeModel>) request.getAttribute("employee");
	%>
	<table>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Age</th>
			<th>Exeprience</th>
			<th>Seniority</th>
			<th>Salary</th>
			<th>Action</th>
		</tr>
		<%
		for (EmployeeModel emp : employee) {
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
			<td><a href="edit?id=${ emp.id}">Edit</a>
			<td><a href="delete?id=${emp.id }">Delete</a>
		</tr>
		<%
		}
		%>

		<tfoot>
			<td colspan="5" align="right">
				<form action="new" method="get">
					<input type="submit" name="submit" value="New Employee" />

				</form>
			</td>
		</tfoot>

	</table>

</body>
</html>