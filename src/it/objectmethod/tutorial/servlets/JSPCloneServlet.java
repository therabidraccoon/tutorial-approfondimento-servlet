package it.objectmethod.tutorial.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JSPCloneServlet extends HttpServlet {
	/**
	 * PROCEDIMENTO SOLO PER SPIEGARE COME FUNZIONA UNA PAGINA JSP (JAVA SERVER PAGE) 
	 * 
	 * NON GENERARE MAI DIRETTAMENTE HTML DA UNA SERVLET!!!!
	 */
	private static final long serialVersionUID = 3031691857127694922L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.write(
				"<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\"><html><head><title>Insert title here</title></head><body>	<h1>HELLO WORLD JSP!</h1>	<p>CIAO!</p>	</body></html>");

	}
}
