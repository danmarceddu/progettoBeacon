

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import gruppoTrack.Login;

/**
 * Servlet implementation class ServletMezzi
 */
@WebServlet("/ServletMezzi")
public class ServletMezzi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletMezzi() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			
		HttpSession session = request.getSession();
		if (session.getAttribute("consentito") == null) {
			PrintWriter out = response.getWriter();
			out.println("<h1>Login non effettuato</h1>");

			session.setAttribute("deviLoggare", request.getRequestURL().toString());
			response.sendRedirect("LoginHome.html");
			return;

		} else {response.setContentType( "text/html; charset=UTF-8");	
		
		
		session.setAttribute("mezzi", request.getParameter("optOrdina"));
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
