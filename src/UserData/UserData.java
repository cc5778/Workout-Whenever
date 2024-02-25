package UserData;

import Enums.Exercise;
import Exercises.Exercises;

import java.util.HashMap;
import java.util.Map;

public class UserData {

    private static Map<User, Map<Exercise, Exercises>> userData = new HashMap<>();     // user, exercise name, the exercise class
    private static Map<String, User> usernames = new HashMap<>();

    public UserData() {
    }


    public void addUser(User user){
        this.userData.put(user, user.getExercises());
        this.usernames.put(user.getUsername(), user);
    }

    public Map<Exercise, Exercises> getUserData(User user) {
        return this.userData.get(user);
    }

    public boolean containsUser(User user) {
        return this.userData.containsKey(user);
    }

    public User getUser(String user){
        return this.usernames.get(user);
    }

    

}
