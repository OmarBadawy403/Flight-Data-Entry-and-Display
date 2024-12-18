import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class travelerServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
	

    public travelerServlet() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String firstname = request.getParameter("firstname");
    	String lastname = request.getParameter("lastname");
    	String phoneNumber = request.getParameter("phoneNumber");
    	String email = request.getParameter("email");

    	HttpSession session = request.getSession();

    	session.setAttribute("firstname", firstname);
    	session.setAttribute("lastname", lastname);
    	session.setAttribute("phoneNumber", phoneNumber);
    	session.setAttribute("email", email);

    	response.sendRedirect("formflight.html");

          
    }
}
