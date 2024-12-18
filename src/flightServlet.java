import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class flightServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public flightServlet() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	HttpSession session = request.getSession(false); 

    	String firstname = (String) session.getAttribute("firstname");
    	String lastname = (String) session.getAttribute("lastname");
    	String phoneNumber = (String) session.getAttribute("phoneNumber");
    	String email = (String) session.getAttribute("email");

    	response.setContentType("text/html");
    	PrintWriter print = response.getWriter();

    	print.println("First Name: " + firstname + "<br>");
    	print.println("Last Name: " + lastname + "<br>");
    	print.println("Phone Number: " + phoneNumber + "<br>");
    	print.println("Email: " + email + "<br>");

    	String nameplane = request.getParameter("nameplane");
    	String ticketnumber = request.getParameter("ticketnumber");
    	String fromcou = request.getParameter("fromcou");
    	String tocou = request.getParameter("tocou");

    	print.println("Plane Name: " + nameplane + "<br>");
    	print.println("Ticket Number: " + ticketnumber + "<br>");
    	print.println("From Country: " + fromcou + "<br>");
    	print.println("To Country: " + tocou + "<br>");

    	RequestDispatcher disp = request.getRequestDispatcher("/infoServlet");
    	disp.forward(request, response);
          

        
        
        
        
        
        
        
}}













