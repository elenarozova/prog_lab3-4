package birds;

import enums.Statuses;
import helps.BirdSleepException;
import helps.RandomCount;
import helps.Fly;

public abstract class Bird implements Fly {
    protected Statuses status = Statuses.START;
    protected int wingPower;
    protected int stamina;
    protected String name = "Птица";

    Bird(int wingPower, String name){
        this.wingPower = wingPower;
        this.stamina = wingPower * RandomCount.GiveCount();
        this.name = name;
    }

    public abstract void doAction();

    protected void checkStamina(){
        if (stamina<=0){
            this.status = Statuses.SLEEP;
            land(name);
        }
    }
    protected void changeStatus(Statuses status){
         this.status = status;
    }

    public void reName(String name){
        this.name = name;
    }

    @Override
    public void rise() throws BirdSleepException {
        int waste = stamina/10;
        useStamina(waste);
        checkStamina();
        if (status.equals(Statuses.SLEEP)){
            throw new BirdSleepException(name,name + " устал");
        }
        changeStatus(Statuses.ACTIVE);
        System.out.println(name + " взлетает");

    }

    public void useStamina(int waste) {
        stamina -= waste;
    }


}
