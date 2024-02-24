package UserData;

import Exercises.Exercises;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserData {

    private Map<User, Map<String, List<Exercises>>> userData;     // user, exercise name, the exercise class

    protected UserData(User user) {

        this.userData = new HashMap<>();
        this.userData.put(user, user.getExercises());

    }



}
