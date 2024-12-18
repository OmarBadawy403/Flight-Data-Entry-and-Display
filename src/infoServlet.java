import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class infoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public infoServlet() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	HttpSession session = request.getSession(false);
    	if (session != null) {
    	    String firstname = (String) session.getAttribute("firstname");
    	    String lastname = (String) session.getAttribute("lastname");
    	    String phoneNumber = (String) session.getAttribute("phoneNumber");
    	    String email = (String) session.getAttribute("email");

    	    String nameplane = request.getParameter("nameplane");
    	    String ticketnumber = request.getParameter("ticketnumber");
    	    String fromcou = request.getParameter("fromcou");
    	    String tocou = request.getParameter("tocou");

    	    response.setContentType("text/html");
    	    PrintWriter out = response.getWriter();

    	    out.println("<html>");
    	    out.println("<head>");
    	    out.println("<style>");
    	    out.println("body { background-color: #f0f0f0; font-family: Arial, sans-serif; }");
    	    out.println(".container { padding: 20px; background-color: #fff; margin: 20px auto; width: 60%; border-radius: 10px; box-shadow: 0 0 10px rgba(0,0,0,0.1); }");
    	    out.println("h2 { color: #2c3e50; text-align: center; }");
    	    out.println("p { font-size: 18px; line-height: 1.6; }");
    	    out.println("strong { color: #34495e; }");
    	    out.println("</style>");
    	    out.println("</head>");
    	    out.println("<body>");
    	    out.println("<div class='container'>");

    	    out.println("<h2>User Information</h2>");
    	    out.println("<p><strong>First Name:</strong> " + (firstname != null ? firstname : "Not available") + "</p>");
    	    out.println("<p><strong>Last Name:</strong> " + (lastname != null ? lastname : "Not available") + "</p>");
    	    out.println("<p><strong>Phone Number:</strong> " + (phoneNumber != null ? phoneNumber : "Not available") + "</p>");
    	    out.println("<p><strong>Email:</strong> " + (email != null ? email : "Not available") + "</p>");

    	    out.println("<h2>Flight Information</h2>");
    	    out.println("<p><strong>Plane Name:</strong> " + (nameplane != null ? nameplane : "Not available") + "</p>");
    	    out.println("<p><strong>Ticket Number:</strong> " + (ticketnumber != null ? ticketnumber : "Not available") + "</p>");
    	    out.println("<p><strong>From Country:</strong> " + (fromcou != null ? fromcou : "Not available") + "</p>");
    	    out.println("<p><strong>To Country:</strong> " + (tocou != null ? tocou : "Not available") + "</p>");
    	    
    	    out.println("</div>");
    	    out.println("</body>");
    	    out.println("</html>");
    	}

    }
}
