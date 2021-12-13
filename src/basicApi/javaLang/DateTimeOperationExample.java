package basicApi.javaLang;

import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class DateTimeOperationExample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDateTime targetDateTime = now.plusYears(1).minusMonths(2).plusDays(3).plusHours(12).minusMinutes(45).plusSeconds(10);
        System.out.println(targetDateTime);

        LocalDateTime targetDateTime2 = null;

        targetDateTime2 = now.withYear(2022).withMonth(2).withDayOfMonth(12).withHour(12).withMinute(3).withSecond(23);
        System.out.println(targetDateTime2);
        //이런식으로 시간을 다룰 수 있다.

        targetDateTime = now.with(TemporalAdjusters.firstDayOfYear());
        targetDateTime = now.with(TemporalAdjusters.lastDayOfYear());
        targetDateTime = now.with(TemporalAdjusters.firstDayOfNextMonth());
        //월과 요일도 마찬가지로 이렇게 상대변경 가능하다.
    }
}
