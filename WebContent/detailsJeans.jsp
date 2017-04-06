<%@page import="model.pojo.IJeansManager"%>
<%@page import="model.pojo.JeansManager"%>
<%@page import="model.pojo.Jeans"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link rel="stylesheet" href="style/menu.css">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
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
<title>Insert title here</title>
<script type="text/javascript">
	function showhide(id) {
		var e = document.getElementById(id);
		e.style.display = (e.style.display == 'block') ? 'none' : 'block';
	}
</script>
</head>
<body>
	<nav class="nav nav--red">
	<ul class="nav__list">
		<li class="nav__list__item"><a href="dateDetails.jsp">Справка
				по дата</a></li>
		<li class="nav__list__item"><a href="sell.jsp">Въвеждане на
				продажби</a></li>
	</ul>
	</nav>
	<%
		Jeans jeans = JeansManager.getInstance()
				.getJeans(Integer.parseInt(request.getAttribute("jeansId").toString()));
	%>
	<table>
		<tr>
			<th>Марка</th>
			<th>Модел</th>
			<th>Размер</th>
			<th>Цена</th>
			<th>Брои</th>
			<th>Цена на едро</th>
			<th></th>
		</tr>
		<tr>
			<td><%=jeans.getBrand()%></td>
			<td><%=jeans.getModel()%></td>
			<td><%=jeans.getSize()%></td>
			<td><%=jeans.getPrice()%></td>
			<td><%=jeans.getCount()%></td>
			<td><%=jeans.getPriceByCount()%></td>
			<td><button type="button" onclick="javascript:showhide('change')">Редактирай</button>
				<button type="button" onclick="javascript:showhide('sell')">Продай</button>
				<button type="button" onclick="javascript:showhide('delete')">Изтрий</button></td>
		</tr>
	</table>
	<table>
		<tr id="change" style="display: none;">

			<td><form action="ChangeServlet" method="post">
					<input type="text" name="brand" value="<%=jeans.getBrand()%>"
						required
						oninvalid="this.setCustomValidity('Моля въведете марка!')"
						oninput="setCustomValidity('')"></td>
			<td><input type="text" name="model"
				value="<%=jeans.getModel()%>" required
				oninvalid="this.setCustomValidity('Моля въведете модел!')"
				oninput="setCustomValidity('')"></td>
			<td><input type="text" name="size" value="<%=jeans.getSize()%>"
				required oninvalid="this.setCustomValidity('Моля въведете размер!')"
				oninput="setCustomValidity('')"></td>
			<td><input type="text" name="price"
				value="<%=jeans.getPrice()%>" required
				oninvalid="this.setCustomValidity('Моля въведете цена!')"
				oninput="setCustomValidity('')"></td>
			<td><input type="text" name="count"
				value="<%=jeans.getCount()%>" required
				oninvalid="this.setCustomValidity('Моля въведете брой!')"
				oninput="setCustomValidity('')"></td>
			<td><input type="text" name="priceByCount"
				value="<%=jeans.getPriceByCount()%>" required
				oninvalid="this.setCustomValidity('Моля въведете цена на едро!')"
				oninput="setCustomValidity('')"></td>
			<td><input type="submit" value="Запази промените">
				</form></td>
		</tr>
	</table>
	<table>
		<tr id="sell" style="display: none;">
			<td><form action="SellServlet" method="post">
					<input type="hidden" name="id" value="<%=jeans.getId()%>">
					<td><input type="hidden" name="model"
						value="<%=jeans.getModel()%>"> <input type="hidden"
						name="brand" value="<%=jeans.getBrand()%>"> <input
						type="hidden" name="size" value="<%=jeans.getSize()%>"> <input
						type="hidden" name="priceByCount"
						value="<%=jeans.getPriceByCount()%>">
					<td>Цена: <input type="text" name="price" required
						oninvalid="this.setCustomValidity('Моля въведете цена')"
						oninput="setCustomValidity('')"></td>
					<td>Брой: <input type="text" name="count" required
						oninvalid="this.setCustomValidity('Моля въведете брой!')"
						oninput="setCustomValidity('')"></td>
					<td><input type="submit" value="Продай">
				</form></td>
		</tr>
	</table>
</body>
</html>