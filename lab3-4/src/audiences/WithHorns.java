package audiences;

public class WithHorns extends Audience{


    @Override
    protected void cheers() {
        System.out.println("Звери наклоняют рога в лад танцу");
    }

    @Override
    protected void looking() {
        System.out.println("Звери наклоняют рога");

    }

    @Override
    protected void inattentivelyLooking() {
        System.out.println("Звери иногда наклоняют рога");
    }

}
