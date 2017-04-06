<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="style/menu.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<nav class="nav nav--red">
		<ul class="nav__list">
			<li class="nav__list__item"><a href="dateDetails.jsp">Справка по дата</a></li>
			<li class="nav__list__item"><a href="sell.jsp">Въвеждане на продажби</a></li>
		</ul>
	</nav>
	<form action="DateDetailsServlet" method="get">
		Избери дата: <input type="date" name="date" required
			oninvalid="this.setCustomValidity('Моля изберете дата!')"
			oninput="setCustomValidity('')">
		<button type="submit">Въведи</button>
	</form>
</body>
</html>