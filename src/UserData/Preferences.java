package UserData;

import Enums.ExerciseTypes;
import Enums.Intensity;
import Enums.Targets;
import Enums.*;

import java.util.List;

public class Preferences {

    private ExerciseTypes type;

    private int time;

    private Intensity intensity;

    private List<Goals> goals;

    private int breaks;



    public Preferences(ExerciseTypes type, int time, Intensity intensity, List<Goals> targets) {

        this.type = type;
        this.time = time;
        this.intensity = intensity;
        this.goals = targets;
        if (intensity == Intensity.BEGINNER) {
            this.breaks = Math.floorDiv(time, 6);
        } else if (intensity == Intensity.INTERMEDIATE) {
            this.breaks = Math.floorDiv(time, 9);
        } else if (intensity == Intensity.PRO) {
            this.breaks = Math.floorDiv(time, 12);
        }

    }

    public ExerciseTypes getType() {
        return this.type;
    }

    public int getTime() {
        return this.time;
    }

    public Intensity getIntensity() {
        return this.intensity;
    }

    public List<Goals> getGoals() {
        return this.goals;
    }

    public int getBreaks() {
        return this.breaks;
    }

    public void setType(ExerciseTypes type){
        this.type = type;
    }

    public void setIntensity(Intensity intensity) {
        this.intensity = intensity;
    }

    public void setGoals(Goals goal) {
        this.goals.add(goal);
    }

}
