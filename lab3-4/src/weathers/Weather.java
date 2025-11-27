package weathers;

import helps.RandomCount;

public abstract class Weather {
    protected int multiplier;
    public String name;
    protected boolean checkDraw = false;

    Weather(int multiplier, String name){
        this.multiplier = multiplier;
        this.name = name;
    }
    abstract void draw();
    public int Hinder(){
        if (!checkDraw){
            draw();
            checkDraw = true;
        }
        return (int)(multiplier * RandomCount.GiveCount()/10);

    }
}
