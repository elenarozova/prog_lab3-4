package weathers;


import java.util.Objects;

public class Rain extends Weather{

    public Rain() {
        super(3, "Дождь");
    }

    @Override
    void draw() {
        System.out.println("Вдруг упала одна капля, а после капля за каплей начали сливать в непреодолимую стену.");
    }
    @Override
    public boolean equals(Object ob){
        if (this == ob) {return true;}
        if (ob == null || getClass() != ob.getClass()) {return false;}
        Rain rain = (Rain) ob;
        return Objects.equals(multiplier,rain.multiplier) && Objects.equals(name,rain.name);
    }

    @Override
    public int hashCode(){
        return Objects.hash(name,multiplier);
    }

    @Override
    public String toString(){
        return "Fog{"
                + "multiplier=" + multiplier
                + ", name=" + name + "}";
    }
}
