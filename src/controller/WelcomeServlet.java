package controller;

import java.awt.List;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.db.JeansDAO;
import model.pojo.Jeans;

/**
 * Servlet implementation class WelcomeServlet
 */
@WebServlet("/WelcomeServlet")
public class WelcomeServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//ArrayList<Jeans> jeans =  (ArrayList<Jeans>) JeansDAO.getInstance().allJeans();
		//request.setAttribute("jeans", jeans);
		RequestDispatcher view=request.getRequestDispatcher("main.jsp");
		view.forward(request, response);
	}
}
