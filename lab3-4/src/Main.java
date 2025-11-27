import audiences.WithHorns;
import audiences.WithTail;
import birds.Crane;
import enums.Statuses;
import helps.BirdSleepException;
import weathers.Fog;
import weathers.Rain;
import weathers.Weather;
import weathers.Wind;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws BirdSleepException {
        Crane crane1 = new Crane("first");
        Crane crane2 = new Crane("second");
        Crane crane3 = new Crane("third");
        ArrayList<Crane> Cranes = new ArrayList<>(3);
        Cranes.add(crane1);
        Cranes.add(crane2);
        Cranes.add(crane3);

        Wind wind1 = new Wind();
        Rain rain1 = new Rain();
        Fog fog1 = new Fog();
        ArrayList<Weather> weathers = new ArrayList<>();
        weathers.add(wind1);
        weathers.add(rain1);
        weathers.add(fog1);

        WithHorns horns = new WithHorns();
        WithTail tail = new WithTail();


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (!Cranes.get(i).getStatus().equals(Statuses.SLEEP)) {
                    Cranes.get(i).useStamina((weathers.get(j).Hinder()));
                }
            }
            if (!Cranes.get(i).getStatus().equals(Statuses.SLEEP)) {
                Cranes.get(i).doAction();
                horns.Reaction(Cranes.get(i).getAdmiration());
                tail.Reaction(Cranes.get(i).getAdmiration());
            }

        }


    }
}
