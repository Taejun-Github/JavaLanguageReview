package basicApi.javaLang;

import java.time.*;

public class DateTimeCreateExample {
    public static void main(String[] args) throws InterruptedException {
        LocalDate currDate = LocalDate.now();
        System.out.println(currDate);

        LocalDate targetDate = LocalDate.of(2021,2,2);
        System.out.println(targetDate);

        LocalTime currTime = LocalTime.now();
        System.out.println(currTime);

        LocalDateTime currDateTime = LocalDateTime.now();
        System.out.println(currDateTime);

        LocalDateTime targetDateTime = LocalDateTime.of(2021, 3, 4, 1, 20, 3);
        System.out.println(targetDateTime);

        ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
        System.out.println(utcDateTime);

        ZonedDateTime newyorkDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println(newyorkDateTime);

        Instant instant1 = Instant.now();
        Thread.sleep(10);
        Instant instant2 = Instant.now();

        if(instant1.isBefore(instant2)) {
            System.out.println();
        } else if (instant1.isAfter(instant2)) {
            System.out.println();
        } else {
            System.out.println();
        }
    }
}
