<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>To Do List</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>
	<header>
		<nav class="navbar navbar-eapand-md navbar-dark" style="background-color: tomato">
			<div>
				<h1>To Do List</h1>
			</div>
			<ul></ul>
		</nav>
	</header>
	<div class="row">
		<div class="container">
			<table class="table table-border">
				<thead>
					<tr>
						<th>ID</th>
						<th>Task Name</th>
						<th>Person Name</th>
						<th>Note</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="task" items="${ListTask}">
						<tr>
							<td><c:out value="${task.id}"/></td>
							<td><c:out value="${task.taskName}"/></td>
							<td><c:out value="${task.personName}"/></td>
							<td><c:out value="${task.note}"/></td>
							<td><a href="">Edit</a></td>
							<td><a href="">Delete</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>