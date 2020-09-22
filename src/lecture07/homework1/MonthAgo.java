package lecture07.homework1;

import java.util.Calendar;
import java.util.Date;

public class MonthAgo {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();
        Calendar monthAgo = Calendar.getInstance();

        monthAgo.set(Calendar.MONTH, now.get(Calendar.MONTH) - 1);

        Date dateNow = now.getTime();
        long l = dateNow.getTime();
        Date dateMonthAgo = monthAgo.getTime();
        long l2 = dateMonthAgo.getTime();

        System.out.println("Difference in month in " + (l - l2) + " milliseconds");
    }
}
