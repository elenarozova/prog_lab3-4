package helps;

import birds.Crane;
import enums.Statuses;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Area {
    protected String name;
    protected List<Crane> cranes;



    public Area(String name){
        this.name = name;
        this.cranes = new ArrayList<>();
    }
    public void addCrane(Crane crane) {
        if (!crane.getStatus().equals(Statuses.SLEEP)){
            cranes.add(crane);
            System.out.println(crane.getName() + " - " + crane.getSize() + " " + crane.getColor() + " птица c " + crane.getNeck() + " шеей прилетел в " + name);
        }
    }

    public void removeCrane(Crane crane) {
        cranes.remove(crane);
        System.out.println(crane.getName() + " улетел из " + name);
    }
    public List<Crane> getCranes(){return cranes;}


    @Override
    public boolean equals(Object ob){
        if (this == ob) {return true;}
        if (ob == null || getClass() != ob.getClass()) {return false;}
        Area area = (Area) ob;
        return Objects.equals(cranes,area.cranes) && Objects.equals(name,area.name);
    }

    @Override
    public int hashCode(){
        return Objects.hash(cranes,name);
    }

    @Override
    public String toString(){
        return "Crane{"
                + "cranes=" + cranes
                + ", name=" + name + "}";
    }
}


