package audiences;

public abstract class Audience {

    public void Reaction(int admiration){
        if (admiration >= 7) {
            cheers();
        } else if (admiration >= 5) {
            looking();
        } else if (admiration >=2) {
            inattentivelyLooking();
        }
    }

    protected abstract void cheers();
    protected abstract void looking();
    protected abstract void inattentivelyLooking();
}
