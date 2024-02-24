package Exercises;

import Enums.Equipment;
import Enums.Goals;
import Enums.Intensity;

import java.util.List;

public abstract class Calisthenics implements Exercises{

    protected Equipment equipment;

    protected Calisthenics(){
        this.equipment = Equipment.NONE;
    }

    @Override
    public abstract int getRating();

    @Override
    public abstract int getRates();

    @Override
    public abstract Intensity getIntensity();

    @Override
    public abstract List<Goals> getGoals();

    @Override
    public abstract int getTime();

    @Override
    public abstract double getWear();


}
