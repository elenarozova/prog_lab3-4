package weathers;

import helps.RandomCount;

import java.util.Objects;

public abstract class Weather {
    protected int multiplier;
    public String name;
    protected boolean checkDraw = false;
    protected int power = RandomCount.GiveCount();

    Weather(int multiplier, String name){
        this.multiplier = multiplier;
        this.name = name;
    }
    Weather(int multiplier,String name, int power){
        this.multiplier = multiplier;
        this.name = name;
        this.power = power;
    }
    abstract void draw();
    public int Hinder(){
        if (!checkDraw){
            draw();
            checkDraw = true;
        }
        return (int)(multiplier * power/10);
    }

    public void resetDraw() {
        checkDraw = false;
    }

    @Override
    public int hashCode(){
        return Objects.hash(name, multiplier);
    }
}
