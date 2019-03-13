

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
 * Servlet implementation class ServletHome
 */
@WebServlet("/ServletHome")
public class ServletHome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletHome() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username=request.getParameter("username");
		String password= request.getParameter("password");
	
		Login l= new Login(username,password);
		
		if (l.Query()) {
			HttpSession session = request.getSession();
			session.setAttribute("consentito", username);
			try
			{
			String target = (String)session.getAttribute("deviLoggare");
			if(target != null)
			{
			response.sendRedirect(target);
			return;
			}
			}
			catch (Exception ignored) {
				
			}
			response.sendRedirect("Home.jsp");
		
			          
		}else response.getWriter().append("username o password errati");
			
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("NuovaReg.jsp");
	}

}
