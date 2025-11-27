package helps;

public interface Fly {
    void rise() throws BirdSleepException;
    default void land(String name){
        System.out.println(name + " устал,он улетел спать");
    }
}
