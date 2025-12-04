package audiences;

public abstract class Audience {

    public void Reaction(int admiration){
        if (admiration >= 10) {
            cheers();
        } else if (admiration >= 7) {
            looking();
        } else if (admiration >=4) {
            inattentivelyLooking();
        }
    }

    protected abstract void cheers();
    protected abstract void looking();
    protected abstract void inattentivelyLooking();
}
