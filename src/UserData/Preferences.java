package UserData;

import Enums.ExerciseTypes;
import Enums.Intensity;
import Enums.Targets;

import java.util.List;

public class Preferences {

    private ExerciseTypes type;

    private int time;

    private Intensity intensity;

    private List<Targets> targets;

    private int breaks;



    public Preferences(ExerciseTypes type, int time, int intensity, List<Targets> targets) {



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

    public List<Targets> getTargets() {
        return this.targets;
    }

    public int getBreaks() {
        return this.breaks;
    }

}
