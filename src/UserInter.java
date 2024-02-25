import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

import UserData.*;
import Enums.*;
@WebServlet("/SetUserInfoServlet")
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
        data.addUser(user);

        // Send a response back to the frontend
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        out.println("{\"success\": true}");
        out.close();
    }
}

@WebServlet("/BuildWorkServlet")
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

        String user = request.getParameter("user");

        // Process the user's selections and generate a workout plan
        // For demonstration purposes, we'll just print the selections
        System.out.println(selections);

        Preferences preferences = new Preferences(null, 0, null, null);

        for (JSONObject s: selections) {
            String x = s.toString();

            if (x == "Calisthenics") {

                preferences.setType(ExerciseTypes.Calisthenics);

            } else if(x == "Pilates") {

                preferences.setType(ExerciseTypes.Pilates);

            } else if(x == "Weightlifting") {
                preferences.setType(ExerciseTypes.Weightlifting);
            } else {
                preferences.setType(ExerciseTypes.Mix);
            }


            if (x == "Beginner") {
                preferences.setIntensity(Intensity.BEGINNER);

            } else if (x == "Intermediate") {

                preferences.setIntensity(Intensity.INTERMEDIATE);

            } else if (x == "Pro") {
                preferences.setIntensity(Intensity.PRO);
            }

            
            if (x == "Flexibility") {

                preferences.setGoals(Goals.FLEXIBILITY);

            } else if (x == "Mobility") {

                preferences.setGoals(Goals.MOBILITY);

            } else if (x == "Strength") {

                preferences.setGoals(Goals.STRENGTH);
            }



        }
        CreateWorkout workout = new CreateWorkout(user, preferences);
        Routine routine = workout.makeWorkoutRoutine();

        // Send a response back to the front-end
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();

        String htmlRespone = "<html>";

        for (Workout w: routine.getRoutine()) {
        htmlRespone += "<h2>Workout:  " + w.toString() + "Reps: " + w.getReps() + "<h2/>";      
        }   
        htmlRespone += "</html>";
         
        // return response
        out.println(htmlRespone);
        
        out.println("{\"success\": true}");
        out.close();
    }
}