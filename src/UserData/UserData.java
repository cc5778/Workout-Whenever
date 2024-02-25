package UserData;

import Enums.Exercise;
import Exercises.Exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UserData {

    private Map<User, Map<Exercise, Exercises>> userData;     // user, exercise name, the exercise class

    public UserData() {
        this.userData = new HashMap<>();
    }

    public void addUser(User user){
        this.userData.put(user, user.getExercises());
    }

    public Map<Exercise, Exercises> getUserData(User user) {
        return this.userData.get(user);
    }

    public boolean containsUser(User user) {
        return this.userData.containsKey(user);
    }

    public CreateWorkout makeWorkout(User user, Preferences preferences){
        CreateWorkout workout = new CreateWorkout(user, preferences);
//        Set<Exercises> topRated = workout.getTopRated();



        return null;
    }


}
