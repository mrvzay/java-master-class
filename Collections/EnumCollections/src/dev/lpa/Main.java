package dev.lpa;

import java.util.*;

public class Main {

    enum WeekDay {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}

    public static void main(String[] args) {

        List<WeekDay> annsWorkDays = new ArrayList<>(List.of(WeekDay.MONDAY,
                WeekDay.TUESDAY, WeekDay.THURSDAY, WeekDay.FRIDAY));

        var annsDaysSet = EnumSet.copyOf(annsWorkDays);
        System.out.println(annsDaysSet.getClass().getSimpleName());
        annsWorkDays.forEach(System.out::println);
        var allDaysSet = EnumSet.allOf(WeekDay.class);
        System.out.println("-".repeat(30));
        allDaysSet.forEach(System.out::println);

        Set<WeekDay> newPersonDays = EnumSet.complementOf(annsDaysSet);
        System.out.println("-".repeat(30));
        newPersonDays.forEach(System.out::println);

        Set<WeekDay> anotherWay = EnumSet.copyOf(allDaysSet);
        anotherWay.removeAll(annsDaysSet);
        System.out.println("-".repeat(30));
        anotherWay.forEach(System.out::println);

        Set<WeekDay> businessDays = EnumSet.range(WeekDay.MONDAY, WeekDay.FRIDAY);
        System.out.println("-".repeat(30));
        businessDays.forEach(System.out::println);

        Map<WeekDay, String[]> employeeMap = new EnumMap<>(WeekDay.class);

        employeeMap.put(WeekDay.FRIDAY, new String[] {"Ann", "Mary", "Bob"});
        employeeMap.put(WeekDay.MONDAY, new String[] {"Mary", "Bob"});
        employeeMap.forEach((k, v) -> System.out.println(k + " : " + Arrays.toString(v)));
    }
}
