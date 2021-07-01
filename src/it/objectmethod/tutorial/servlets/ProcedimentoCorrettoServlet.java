package it.objectmethod.tutorial.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProcedimentoCorrettoServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8458191468829322734L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("attributoDaServlet", new Integer(324));
		req.getRequestDispatcher("/jsp/view-procedimento-corretto.jsp").forward(req, resp);
	}
}
