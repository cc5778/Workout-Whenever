import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

import UserData.*;

public class SetUserInfoServlet extends HttpServlet {
        
    UserData data = new UserData();

    public void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        // Get the username and password from the request
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Set the user's information in the database or some other storage mechanism
        // For demonstration purposes, we'll just print the username and password
        System.out.println("Your Username: " + username);
        System.out.println("Your Password: " + password);
        
        User user = new User(username, password);

        if (!data.containsUser(user)) {
            data.addUser(user);
        }

        // Send a response back to the frontend
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        out.println("{\"success\": true}");
        out.close();
    }
}
public class BuildWorkServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        // Get the user's selections from the request
        BufferedReader reader = request.getReader();
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            sb.append(line);
        }
        String json = sb.toString();
        JSONObject selections = new JSONObject(json);

        // Process the user's selections and generate a workout plan
        // For demonstration purposes, we'll just print the selections
        System.out.println(selections);

        // Send a response back to the front-end
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        out.println("{\"success\": true}");
        out.close();
    }
}