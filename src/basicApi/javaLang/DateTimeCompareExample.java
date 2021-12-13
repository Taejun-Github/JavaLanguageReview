package basicApi.javaLang;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeCompareExample {
    public static void main(String[] args) {
        LocalDateTime startDateTime = LocalDateTime.of(2021,1,1,9,0,0);
        System.out.println(startDateTime);

        LocalDateTime endDateTime = LocalDateTime.of(2023, 3,31, 18, 0, 0);
        System.out.println(endDateTime);

        if(startDateTime.isBefore(endDateTime)) {
            System.out.println("진행 중입니다.");
        } else if(startDateTime.isEqual(endDateTime)) {
            System.out.println("종료합니다.");
        } else if(startDateTime.isAfter(endDateTime)) {
            System.out.println("종료했습니다.");
        }


        long remainYear = startDateTime.until(endDateTime, ChronoUnit.YEARS);
        long remainMonth = startDateTime.until(endDateTime, ChronoUnit.MONTHS);
        long remainDay = startDateTime.until(endDateTime, ChronoUnit.DAYS);
        long remainHour = startDateTime.until(endDateTime, ChronoUnit.HOURS);
        long remainMinute = startDateTime.until(endDateTime, ChronoUnit.MINUTES);
        long remainSecond = startDateTime.until(endDateTime, ChronoUnit.SECONDS);

        remainYear = ChronoUnit.YEARS.between(startDateTime, endDateTime);
        remainMonth = ChronoUnit.MONTHS.between(startDateTime, endDateTime);
        remainDay = ChronoUnit.DAYS.between(startDateTime, endDateTime);
    }
}
