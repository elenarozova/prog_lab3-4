package helps;

public class BirdSleepException extends Exception{
    protected String name;
    public BirdSleepException(String name,String message){
        super(message);
        this.name = name;
    }

    @Override
    public String getMessage(){
        return name +" устал и больше не может летать.";
    }
}
