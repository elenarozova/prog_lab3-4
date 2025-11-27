package birds;
import java.util.Objects;
import enums.Statuses;
import helps.BirdSleepException;
import helps.DanceCharacteristics;

public class Crane extends Bird{
    protected int admiration = 0;

    public Crane(String name) throws BirdSleepException {
        super(1, name);
        rise();
    }

    @Override
    public void doAction() {
        checkStamina();
        if (!status.equals(Statuses.SLEEP)) {
            System.out.println(name + " преодолел все трудности и начал танцевать");
            if (stamina >= 4) {
                DanceCharacteristics great = new DanceCharacteristics(" взлетал, то, едва коснувшись земли, быстро кружился на одной ноге, скользил так легко и бесшумно", 10,4);
                Dance(great);
            }
            else if (stamina >= 2) {
                DanceCharacteristics normal = new DanceCharacteristics(" взлетал, то, едва коснувшись земли, быстро кружился на одной ноге", 7,2);
                Dance(normal);
            }
            else if (stamina >= 0) {
                DanceCharacteristics bad = new DanceCharacteristics(" тихонько кружился на ноге", 4,1);
                Dance(bad);
            }
        }
    }
    public Statuses getStatus(){
        return status;
    }

    protected void Dance(DanceCharacteristics dance){
        this.admiration = dance.admiration();
        System.out.println(name + dance.description());
        useStamina(dance.useStamina());
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
        return Objects.hash(stamina,status,name,wingPower,admiration);
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
