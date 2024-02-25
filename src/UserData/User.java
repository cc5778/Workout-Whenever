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

    /** the user's personal set of exercises, with personalized ratings, rates, etc. */
    private Map<Exercise, Exercises> exercises;


    public User(String username, String password, UserLevel level) {
        this.username = username;
        this.password = password;
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

}
