import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class SetUserInfoServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        // Get the username and password from the request
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Set the user's information in the database or some other storage mechanism
        // For demonstration purposes, we'll just print the username and password
        System.out.println("Your Username: " + username);
        System.out.println("Your Password: " + password);

        // Send a response back to the frontend
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        out.println("{\"success\": true}");
        out.close();
    }
}