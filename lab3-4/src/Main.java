import audiences.Audience;
import audiences.WithHorns;
import audiences.WithTail;
import birds.Crane;
import enums.Statuses;
import helps.Area;
import helps.BirdSleepException;
import weathers.Fog;
import weathers.Rain;
import weathers.Weather;
import weathers.Wind;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws BirdSleepException {

        Crane crane1 = new Crane("Никита",2,2,"коричневая","длинной");
        Crane crane2 = new Crane("Маша",2,2);
        Crane crane3 = new Crane("Бегемот",1);
        List<Crane> cranes = new ArrayList<>();
        cranes.add(crane1);
        cranes.add(crane2);
        cranes.add(crane3);
        for (Crane crane : cranes) {
            try {
                crane.rise();

            } catch (BirdSleepException e) {
                System.out.println(e.getMessage());
            }
        }

        Wind wind1 = new Wind();
        Rain rain1 = new Rain();
        Fog fog1 = new Fog();
        ArrayList<Weather> weathers = new ArrayList<>();
        weathers.add(wind1);
        weathers.add(rain1);
        weathers.add(fog1);


        for (Crane crane : cranes) {
            for (Weather weather : weathers) {
                if (!crane.getStatus().equals(Statuses.SLEEP)) {
                    if (crane.getStamina() > weather.Hinder()) {
                        crane.useStamina(weather.Hinder());
                        System.out.println(crane.getName() + " преодолел " + weather.name);
                    } else {
                        crane.useStamina(-1);
                        System.out.println(crane.getName() + " не преодолел " + weather.name);
                    }
                }
            }
        }

        WithHorns horns = new WithHorns();
        WithTail tail = new WithTail();
        List<Audience> audiences = List.of(horns, tail);

        Area Kylaberga = new Area("Кулаберга");
        for ( Crane crane : cranes){
            Kylaberga.addCrane(crane);
        }

        for (Crane crane : Kylaberga.getCranes()) {
            while (crane.getStamina() > 0 && crane.getAdmiration() <= 7) {
                for (Audience audience : audiences) {
                    audience.Reaction(crane.getAdmiration());
                }
                crane.doAction();
                if (crane.getAdmiration() > 7) {
                    System.out.println(crane.getName() + " прекрасно закончил свой танец");
                }
            }
        }

        while (Kylaberga.getCranes().size()>0){Kylaberga.removeCrane(Kylaberga.getCranes().get(0));}
    }
}

