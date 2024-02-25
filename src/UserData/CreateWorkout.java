package UserData;

import Enums.Exercise;
import Enums.Intensity;
import Enums.Targets;
import Exercises.Exercises;

import java.lang.reflect.Array;
import java.util.*;
import java.util.random.RandomGenerator;
import java.util.stream.Collectors;


/**
 * Creates a workout, based on user information and preferences for this workout
 *
 */
public class CreateWorkout {

    private User user;

    private int rating;

    private Map<Exercise, Exercises> exercises;

    private Preferences preferences;

    protected CreateWorkout(User user, Preferences preferences){

        this.user = user;
        this.exercises = user.getExercises();
        this.rating = 0;        // starts off at 0, after getting a rating after the workout, will be on scale 1-10
        this.preferences = preferences;

    }

    public Set<Exercises> getTopRated() {
        Set<Exercises> sorted = new TreeSet<Exercises>(new RatingComparator());
        sorted.addAll(this.exercises.values());
        return sorted;
    }

    public Routine makeWorkoutRoutine(){
        Set<Exercises> sorted = getTopRated();
        List<Exercises> filtered = sorted.stream()
                .filter((e) -> e.getType() == (this.preferences.getType()))
                .filter((e) -> {
                    for (Targets t: e.getTargets())
                        if (this.preferences.getTargets().contains(t))
                            return true;
                    return false;
                })
                .filter((e) -> e.getIntensity() == this.preferences.getIntensity())
                .collect(Collectors.toList());

        Routine routine = new Routine();
        int time = this.preferences.getTime();
        int numExercises = (Math.floorDiv(time,10) - 1);
        List<Workout> exercises = new ArrayList<>();

        Random random = new Random();
        for (int i=0; i < numExercises; i++) {
            int index = random.nextInt(0, filtered.size() - 1);
            Exercises exercise = filtered.get(index);

            int reps;
            if (exercise.getIntensity() == Intensity.BEGINNER) {

                reps = Math.floorDiv((Math.floorDiv(100, numExercises)), Math.round(user.getUserLevel() * exercise.getWear()));

            } else if (exercise.getIntensity() == Intensity.INTERMEDIATE) {

                reps = Math.floorDiv((Math.floorDiv(200, numExercises)), Math.floor(user.getUserLevel() * exercise.getWear()));

            } else if (exercise.getIntensity() == Intensity.PRO) {

                reps = Math.floorDiv((Math.floorDiv(300, numExercises)),(user.getUserLevel() * exercise.getWear()));

            }
            
            int sets = Math.floorDiv(10, reps);


            Workout workout = new Workout(exercise, sets, reps);
            exercises.add(workout);
        }

        return routine;

    }



}
