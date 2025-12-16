package birds;

import enums.Statuses;
import helps.BirdAppearance;
import helps.BirdSleepException;
import helps.RandomCount;
import helps.Fly;

public abstract class Bird implements Fly {
    protected Statuses status = Statuses.ONSURFACE;
    protected int wingPower;
    protected int stamina;
    protected String name = "Птица";
    protected int wingsCounter = 2;
    protected BirdAppearance appearance;
    protected int height = 0;

    Bird(int wingPower, String name,int wingsCounter, BirdAppearance appearance) {
        this.wingPower = wingPower;
        this.stamina = wingPower * RandomCount.GiveCount();
        this.name = name;
        this.wingsCounter = wingsCounter;
        this.appearance = appearance;
    }

    public abstract void doAction() throws BirdSleepException;

    protected void checkStamina(){
        if (stamina<=0 && status != Statuses.SLEEP){
            this.status = Statuses.SLEEP;
            System.out.println(name + " устал и больше не может продолжать");
        }
    }
    protected void changeStatus(Statuses status){
         this.status = status;
    }

    public void reName(String name){
        this.name = name;
    }
    public String getName(){return name;}
    public int getStamina(){return stamina;}
    public String getColor(){return appearance.color();}
    public String getNeck(){return appearance.neck();}
    public String getSize(){return appearance.size();}

    @Override
    public void rise() throws BirdSleepException {
        if (wingsCounter < 2) {
            changeStatus(Statuses.SLEEP);
            throw new BirdSleepException(name, "не может взлететь - недостаточно крыльев");
        }
        int waste = Math.round(stamina/10) + 1 ;
        useStamina(-(waste));
        checkStamina();
        if (!status.equals(Statuses.SLEEP)) {
            changeStatus(Statuses.FLY);
            height += 50;
            System.out.println("Широко раскрыв крылья " + name + " взлетел");

        }
    }

    @Override
    public void land(String name) {
        height=0;
        int waste = Math.round(stamina/10) + 1 ;
        useStamina(-(waste));
        checkStamina();
        if (!status.equals(Statuses.SLEEP)){
        status= Statuses.ONSURFACE;
        System.out.println(name + " коснулся земли и крутится на одной ноге");}
    }

    public void useStamina(int waste) {
        stamina += waste;
    }


}
