<%@page
	import="com.valtech.training.assignmentHib.model.DepartmentModel"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Department List</h1>
	<%
	List<DepartmentModel> department = (List<DepartmentModel>) request.getAttribute("department");
	%>
    <table border="1" width="30%" height="30%">
		<tr>
			<th>Id</th>
			<th>Name</th>
	         <th>Location</th>
			<th>Action</th>
		</tr>
		<%
		for (DepartmentModel dept : department) {
			request.setAttribute("dept", dept);
			/* for jstl setAttribute has to be used  */
		%>
		<tr>
			<td>${dept.deptId}</td>
			<td>${dept.deptName}</td>
			<td>${dept.deptLocation}</td>
			
			<td><a href="edit?deptId=${ dept.deptId}">Edit</a>
			<td><a href="delete?deptId=${dept.deptId }">Delete</a>
			<td><a href="getEmployees?deptId=${dept.deptId }">Employees</a>
		</tr>
		<%
		}
		%>

		<tfoot>
			<td colspan="5" align="right">
				<form action="new" method="get">
					<input type="submit" name="submit" value="New Department" />

				</form>
			</td>
		</tfoot>

	</table>

</body>
</html>