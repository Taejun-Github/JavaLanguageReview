package basicApi.javaLang;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        Date now = new Date();
        String strNow1 = now.toString();
        System.out.println(strNow1);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmss");
        String strNow2 = sdf.format(now);

        Calendar cal1 = Calendar.getInstance();
        int year = cal1.get(Calendar.YEAR);
        int month = cal1.get(Calendar.MONTH) + 1;
        int day = cal1.get(Calendar.DAY_OF_MONTH);
        int week = cal1.get(Calendar.DAY_OF_WEEK);
    }
}
