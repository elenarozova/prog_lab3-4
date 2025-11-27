package audiences;

public class WithTail extends Audience{

    @Override
    protected void cheers() {
        System.out.println("Звери в восхищении бьют хвостами");
    }

    @Override
    protected void looking() {
        System.out.println("Звери бьют хвастами в такт");
    }

    @Override
    protected void inattentivelyLooking() {
        System.out.println("Звери, когда видят, бьют хвостами");
    }
}
