package UserData;

import Enums.Exercise;
import Exercises.Exercises;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;



/**
 * Creates a workout, based on user information and preferences for this workout
 *
 */
public class Workout {

    private User user;

    private int rating;

    private int time;

    private int intensity;

    private int wear;

    private int breaks;

    private Map<String, Exercises> exercises;

    protected Workout(User user){
        this.user = user;

    }

    public Map<Exercise, Exercises> getTopRated() {
        Map<Exercise, Exercises> sorted = new TreeMap<Exercise, Exercises>(new RatingComparator());
        return sorted;
    }

}
