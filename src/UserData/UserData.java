package UserData;

import Enums.Exercise;
import Exercises.Exercises;

import java.util.HashMap;
import java.util.Map;

public class UserData {

    private Map<User, Map<Exercise, Exercises>> userData;     // user, exercise name, the exercise class

    public UserData() {
        this.userData = new HashMap<>();
    }

    public void addUser(String username, String password){
        User user = new User(username, password);
        this.userData.put(user, user.getExercises());
    }

    public Map<Exercise, Exercises> getUserData(User user) {
        return this.userData.get(user);
    }

    public boolean containsUser(User user) {
        return this.userData.containsKey(user);
    }

    

}
