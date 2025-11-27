package weathers;

import java.util.Objects;

public class Wind extends Weather{
    public Wind() {
        super(1, "Ветер");
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
    public int hashCode(){
        return Objects.hash(name,multiplier);
    }

    @Override
    public String toString(){
        return "Wind{"
                + "multiplier=" + multiplier
                + ", name=" + name + "}";
    }
}
