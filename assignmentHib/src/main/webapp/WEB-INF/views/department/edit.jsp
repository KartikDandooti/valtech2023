<%@page
	import="com.valtech.training.assignmentHib.model.DepartmentModel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Editing Department</h1>
	<%
	DepartmentModel dept = (DepartmentModel) request.getAttribute("department");
	%>

	<form method="post" action="save?deptId=<%=dept.getDeptId()%>">
		<table>
			<tr>
				<td>deptId</td>
				<td><input type="text" name="deptId"
					value="<%=dept.getDeptId()%>" disabled="disabled"></td>
			</tr>
			<tr>
				<td>deptName</td>
				<td><input type="text" name="deptName"
					value="<%=dept.getDeptName()%>"></td>
			</tr>
			<tr>

				<td>deptLocation</td>
				<td><input type="text" name="deptLocation"
					value="<%=dept.getDeptLocation()%>"></td>
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