package src.innerFuncs;

import src.enums.Weather;
import src.objects.Nature;

import java.util.GregorianCalendar;

public class TimeSkipper {
    public static void timeSkip(int days, boolean describe){
        Nature.getGlobTime().add(GregorianCalendar.DATE, days);
        Nature.setWeather(Weather.randomWeather());
        System.out.println("-> Прошло " + days + " дней");
        if (describe) {
            Nature.WeatherForecast.printInfo();
        }
        ConditionCheck.checkCondition();
        }
}
