package UserData;

import Enums.Exercise;
import Exercises.Exercises;

public class Workout {

    private Exercise exercise;

    private int reps;

    private int sets;

    public Workout(Exercises exercise2, int reps, int sets) {

        this.exercise = exercise;
        this.reps = reps;
        this.sets = sets;

    }

    public Exercise getExercise(){
        return this.exercise;
    }

    public int getReps() {
        return this.reps;
    }

    public int getSets() {
        return this.sets;
    }


}
