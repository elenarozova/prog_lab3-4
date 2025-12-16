package weathers;



import java.util.Objects;

public class Fog extends Weather{
    public Fog() {
        super(2, "Туман");
    }
    public Fog(int power) {
        super(2, "Туман", power);
    }

    @Override
    void draw() {
        System.out.println("Туман стелится над болотами");
    }

    @Override
    public boolean equals(Object ob){
        if (this == ob) {return true;}
        if (ob == null || getClass() != ob.getClass()) {return false;}
        Fog fog = (Fog) ob;
        return Objects.equals(multiplier,fog.multiplier) && Objects.equals(name,fog.name);
    }



    @Override
    public String toString(){
        return "Fog{"
                + "multiplier=" + multiplier
                + ", name=" + name + "}";
    }
}
