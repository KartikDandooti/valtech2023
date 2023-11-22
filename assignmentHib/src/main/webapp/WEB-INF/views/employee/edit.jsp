<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.valtech.training.assignmentHib.model.EmployeeModel"%>
<%--  <%@page import="com.valtech.training.assignmentHib.entities.Employee"%> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Editing employee</h1>
	<%
	EmployeeModel emp = (EmployeeModel) request.getAttribute("employee");
	request.setAttribute("emp", emp);
	%>
	<form method="post" action="save?id=<%=emp.getId()%>">
		<table>
			<tr>
				<td>Id</td>
				<td><input type="text" name="id" value="${emp.id}"
					disabled="disabled"></td>
			</tr>
			<tr>
				<td>Name</td>
				<td><input type="text" name="name" value="${emp.name }">
				</td>
			</tr>

			<td>Age</td>
			<td><input type="text" name="age" value="${ emp.age}">
			</td>
			</tr>
              <tr>
			<td>Experience</td>
			<td><input type="text" name="experience"
				value="${ emp.experience}"></td>
			</tr>
            <tr>
			<td>Seniority</td>
			<td><input type="text" name="seniority"
				value="${ emp.seniority}"></td>
			</tr>

             <tr>
			<td>Salary</td>
			<td><input type="text" name="salary"
				value="${ emp.salary}"></td>
			</tr>
			<tr>
			<td>DepartId</td>
			<td><input type="text" name="department"
				value="${ emp.department.deptId}"></td>
			</tr>

			<tr>
				<td colspan="2"><input type="submit" name="submit"
					value="Create"> <input type="submit" name="cancel"
					value="Cancel"></td>
			</tr>
		</table>



	</form>

</body>
</html>
