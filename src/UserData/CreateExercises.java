package UserData;

import Enums.Exercise;
import Exercises.*;

public class CreateExercises {

    public Exercises create(Exercise exercise) {

        if (exercise == Exercise.SQUATS) {
            Exercises squats = new Squats();
            return squats;
        }


        return null;
    }

}
