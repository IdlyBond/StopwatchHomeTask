import java.sql.Time;
import java.time.DayOfWeek;
import java.time.LocalTime;
import java.time.YearMonth;
import java.time.temporal.*;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        LocalTime old = LocalTime.now();
        Thread.sleep(1000);
        LocalTime now = LocalTime.now();
        LocalTime out = LocalTime.of(0,
                now.getMinute() - old.getMinute(),
                now.getSecond() - old.getSecond(),
                now.getNano() - old.getNano());
        System.out.println(old + "\n" + now + "\n" + out + "\n");
    }
}
