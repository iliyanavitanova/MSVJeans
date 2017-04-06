package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.db.JeansDAO;
import model.pojo.Jeans;
import model.pojo.JeansManager;

@WebServlet("/AddJeansServlet")
public class AddJeansServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		Jeans jeans = new Jeans(request.getAttribute("brand").toString(),
				request.getAttribute("model").toString(),
				Integer.parseInt(request.getAttribute("size").toString()),
				Integer.parseInt(request.getAttribute("count").toString()),
				Double.parseDouble(request.getAttribute("price").toString()),
				Double.parseDouble(request.getAttribute("priceByCount")
						.toString()));
		JeansDAO.getInstance().saveJeans(jeans);
		RequestDispatcher view = request.getRequestDispatcher("category.jsp");
		view.forward(request, response);
	}

}
