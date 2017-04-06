package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.pojo.JeansManager;

@WebServlet("/DetailsServlet")
public class DetailsServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int jeansId = Integer.parseInt(request.getParameter("id"));
		request.setAttribute("jeansId", jeansId);
		RequestDispatcher view = request.getRequestDispatcher("detailsJeans.jsp");
		view.forward(request, response);
	}

}
