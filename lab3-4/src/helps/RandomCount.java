package helps;

public class RandomCount {
    private RandomCount(){};
    static public int GiveCount(){
        return (int)(Math.random()*10+1);
    }
}
