package Exercises;

import java.util.List;

import Enums.*;

public class Squats implements Exercises {

    private int Rating;

    private int numRates;

    private final Intensity intensity = Intensity.BEGINNER;

    private List<Goals> goals;

    private int time;       // per 5 reps in seconds

    private double wear;       // how tired the exercise makes you

    private final ExerciseTypes exerciseType = ExerciseTypes.Calisthenics;

    public Squats() {
        super();
        this.Rating = 1;
        this.numRates = 0;
        this.time = 15;
        this.wear = 2;
    }

    @Override
    public int getRating() {
        return this.Rating;
    }

    @Override
    public int getRates() {
        return this.numRates;
    }

    @Override
    public Intensity getIntensity() {
        return this.intensity;
    }

    @Override
    public List<Goals> getGoals() {
        return this.goals;
    }

    @Override
    public int getTime() {
        return this.time;
    }

    @Override
    public double getWear() {
        return this.wear;
    }

    @Override
    public List<Targets> getTargets() {
        return null;
    }

    @Override
    public ExerciseTypes getType() {
        return this.exerciseType;
    }
}
