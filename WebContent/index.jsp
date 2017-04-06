<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="style/menu.css">
<title>Insert title here</title>
</head>
<body>
<nav class="nav nav--red">
		<ul class="nav__list">
			<li class="nav__list__item"><a href="dateDetails.jsp">Справка по дата</a></li>
			<li class="nav__list__item"><a href="sell.jsp">Въвеждане на продажби</a></li>
		</ul>
	</nav>
	<h1>MSV Jeans</h1>
	<form action="WelcomeServlet" method="GET">
		<button type="submit">Влез</button>
	</form>
</body>
</html>