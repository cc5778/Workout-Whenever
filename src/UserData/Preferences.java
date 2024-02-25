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



    public Preferences(ExerciseTypes type, int time, Intensity intensity, List<Targets> targets) {

        this.type = type;
        this.time = time;
        this.intensity = intensity;
        this.targets = targets;
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

    public List<Targets> getTargets() {
        return this.targets;
    }

    public int getBreaks() {
        return this.breaks;
    }

}
