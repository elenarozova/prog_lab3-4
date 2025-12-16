package weathers;

import java.util.Objects;

public class Wind extends Weather{
    public Wind() {
        super(1, "Ветер");
    }
    public Wind(int power) {
        super(1, "Ветер", power);
    }

    @Override
    void draw() {
        System.out.println("Вдруг подул ветер.");
    }

    @Override
    public boolean equals(Object ob){
        if (this == ob) {return true;}
        if (ob == null || getClass() != ob.getClass()) {return false;}
        Wind wind = (Wind) ob;
        return Objects.equals(multiplier,wind.multiplier) && Objects.equals(name,wind.name);
    }


    @Override
    public String toString(){
        return "Wind{"
                + "multiplier=" + multiplier
                + ", name=" + name + "}";
    }
}
