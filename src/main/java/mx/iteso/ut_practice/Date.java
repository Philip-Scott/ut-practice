package mx.iteso.ut_practice;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Date {
    public String age (String fecha){
        String age = "";
        String[] parts = fecha.split("/");
        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);

        LocalDate start = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now(); // use for age-calculation: LocalDate.now()

        long days = start.getDay ();
        long months = ChronoUnit.MONTHS.between(start, today);
        long years = ChronoUnit.YEARS.between(start, today);

        System.out.println(years); // 17
        System.out.println(months); // 17
        System.out.println(days); // 17

        age += (years > 1 ? years + " años" : "1 año") + (months > 1 ? months + " meses" : "1 mes") + (days > 1 ? days + " dias" : "1 dia");

        return age;
    }
}
