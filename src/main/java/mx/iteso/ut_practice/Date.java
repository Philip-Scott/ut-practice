package mx.iteso.ut_practice;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Date {
    private static String INVALID_ERROR = "Error: Formato invalido";
    private static String INVALID_DAY = "Error: Dia invalido";
    private static String INVALID_MONTH = "Error: Mes invalido";
    private static String INVALID_YEAR = "Error: Ano invalido";
    private static String FUTURE_DATE = "Error: fecha futura";

    public String age(String fecha) {
        String age = "";
        String[] parts = fecha.split("/");

        if (parts.length != 3)
            return INVALID_ERROR;

        int day, month, year;


        day = get_number(parts[0]);
        month = get_number(parts[1]);
        year = get_number(parts[2]);

        if (day == -1) return INVALID_DAY;
        if (month == -1) return INVALID_MONTH;
        if (year == -1) return INVALID_YEAR;

        LocalDate start;
        LocalDate today = LocalDate.now();

        try {
            start = LocalDate.of(year, month, day);
        } catch (java.time.DateTimeException e) {
            return e.getMessage().contains("DayOfMonth") ? INVALID_DAY : INVALID_MONTH;
        }


        if (today.isBefore(start)) return FUTURE_DATE;

        Period between = Period.between(start, today);

        long days = between.getDays();
        long months = between.getMonths();
        long years = between.getYears();

        age += (years > 1 ? years + " años " : "1 año ") + (months > 1 ? months + "meses y " : "1 mes y ") + (days > 1 ? days + " dias" : "1 dia");

        return age;
    }

    private int get_number(String string) {
        int number;

        try {
            number = Integer.parseInt(string);
        } catch (NumberFormatException e) {
            number = -1;
        }
        if (number < 1)
            number = -1;

        return number;
    }
}