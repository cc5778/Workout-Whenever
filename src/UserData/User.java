package UserData;

import Exercises.Exercises;

import java.util.List;
import java.util.Map;

public class User{

    private String username;

    private String password;

    private Map<String, List<Exercises>> pastWorkouts;

    private Map<String, List<Exercises>> exercises;


    public Map<String, List<Exercises>> getExercises() {
        return this.exercises;
    }

}
