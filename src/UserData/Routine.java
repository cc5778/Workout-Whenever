package UserData;

import java.util.ArrayList;
import java.util.List;

public class Routine {

    private List<Workout> routine;

    public Routine() {

        this.routine = new ArrayList<Workout>();

    }

    public List<Workout> getRoutine() {
        return this.routine;
    }

    public void insertSpaced(Workout element) {

        int sets = element.getSets() + 1;
        int spacing = Math.floorDiv(this.routine.size(), sets);

        for (int i=0; i < element.getSets(); i = i + spacing) {
            this.routine.add(i + spacing, element);
        }

    }


}
