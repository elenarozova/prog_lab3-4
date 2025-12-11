package birds;
import java.util.Objects;
import enums.Statuses;
import helps.BirdAppearance;
import helps.BirdSleepException;

public class Crane extends Bird{
    protected int admiration = 0;

    public Crane(String name, int wingsCounter)  {
        super(2, name, wingsCounter, new BirdAppearance("серая", "длинная", "большая"));
    }
    public Crane(String name, int wingsCounter, String color,String neck)  {
        super(2, name, wingsCounter,new BirdAppearance(color, neck,"большая"));
    }
    public Crane(String name, int wingsCounter, int wingPower) {
        super(wingPower, name, wingsCounter, new BirdAppearance("серая", "длинная", "большая"));
    }
    public Crane(String name,int wingsCounter,  int wingPower, String color, String neck) {
        super(wingPower, name, wingsCounter, new BirdAppearance(color, neck,"большая"));
    }
    public Crane(String name, int wingsCounter, int wingPower, String color, String neck, String size) {
        super(wingPower, name, wingsCounter, new BirdAppearance(color,neck,size));
    }


    @Override
    public void doAction() throws BirdSleepException{
            if (height == 0){
                rise();
                admiration+=1;
            }
            else if (height>0) {
                land(name);
                admiration+=1;
            }
            checkStamina();


    }



    public Statuses getStatus(){
        return status;
    }




    public int getAdmiration(){return admiration;}

    @Override
    public boolean equals(Object ob){
        if (this == ob) {return true;}
        if (ob == null || getClass() != ob.getClass()) {return false;}
        Crane crane = (Crane) ob;
        return Objects.equals(status,crane.status) && Objects.equals(admiration,crane.admiration) && Objects.equals(wingPower,crane.wingPower) && Objects.equals(stamina,crane.stamina) && Objects.equals(name,crane.name);
    }

    @Override
    public int hashCode(){
        return Objects.hash(stamina,status,name,wingPower,admiration,wingsCounter);
    }

    @Override
    public String toString(){
        return "Crane{"
                + "status=" + status
                + ", wingPower=" + wingPower
                + ", stamina=" + stamina
                + ", name=" + name
                + ", admiration=" + admiration + "}";
    }
}
