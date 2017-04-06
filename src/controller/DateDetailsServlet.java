package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.pojo.JeansManager;

@WebServlet("/DateDetailsServlet")
public class DateDetailsServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String date = request.getParameter("date").toString();
		request.setAttribute("date", date);
		RequestDispatcher view = request.getRequestDispatcher("date.jsp");
		view.forward(request, response);
	}

}
