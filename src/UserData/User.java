package UserData;

import Enums.Exercise;
import Enums.UserLevel;
import Exercises.Exercises;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class User{

    /** user's username */
    private String username;

    /** user's password */
    private String password;

    /** a map of the user's past workouts */
    private Map<String, Set<CreateWorkout>> pastWorkouts;

    /** the user's personal set of exercises, with personalized ratings, rates, etc. */
    private Map<Exercise, Exercises> exercises;

    /** how athletic the user is */
    private int userLevel;

    public User(String username, String password, UserLevel level) {
        this.username = username;
        this.password = password;
        if (level == UserLevel.Pro) {
            this.userLevel = 100;
        } else if (level == UserLevel.Intermediate) {
            this.userLevel = 50;
        } else {
            this.userLevel = 0;
        }
        this.exercises = new TreeMap<Exercise, Exercises>();
        CreateExercises c = new CreateExercises();
        for (Exercise e: Exercise.values()) {
            this.exercises.put(e, c.create(e));
        }

    }

    public String getUsername() {
        return this.username;
    }

    public void updatePassword(String newPW) {
        this.password = newPW;
    }

    public Map<Exercise, Exercises> getExercises() {
        return this.exercises;
    }

    public int getUserLevel() {
        return this.userLevel;
    }



}
