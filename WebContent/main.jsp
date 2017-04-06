<!DOCTYPE html>
<%@page import="model.pojo.JeansManager"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="UTF-8"%>
<%@page import="model.db.JeansDAO"%>
<%@page import="model.pojo.Jeans"%>
<html>
<head>
<link rel="stylesheet" href="style/menu.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<style>
table {
	border-collapse: collapse;
	width: 100%;
}

th, td {
	padding: 8px;
	text-align: left;
	border-bottom: 1px solid #ddd;
}

tr:hover {
	background-color: #f5f5f5
}
</style>
</head>
<body>
<nav class="nav nav--red">
		<ul class="nav__list">
			<li class="nav__list__item"><a href="dateDetails.jsp">Справка по дата</a></li>
			<li class="nav__list__item"><a href="sell.jsp">Въвеждане на продажби</a></li>
		</ul>
	</nav>
	<h2>MSV Jeans</h2>

	<table>
		<tr>
			<th>Марка</th>
			<th>Модел</th>
			<th>Размер</th>
			<th>Цена</th>
		</tr>

		<%
			for (Jeans jeans : JeansManager.getInstance().getAllJeans().values()) {
		%>

		<tr onclick="window.location.href='DetailsServlet?id=<%=jeans.getId()%>'">
			<td><%=jeans.getBrand()%></td>
			<td><%=jeans.getModel()%></td>
			<td><%=jeans.getSize()%></td>
			<td><%=jeans.getPrice()%></td>
		</tr>

		<%
			}
		%>
	</table>
	<script type="text/javascript">
		jQuery(document).ready(function($) {
			$(".clickable-row").click(function() {
				location.href = $(this).data("href");
			});
		});
	</script>
</body>
</html>
