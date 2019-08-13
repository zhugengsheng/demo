import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Calendar;
import java.util.Date;

public class test1 {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        long time = new Date().getTime();
        System.out.println(time);
        System.out.println("longToDate："+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(time)));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        System.out.println("============");
        long time0 = System.currentTimeMillis();
        long time1 = new Date().getTime();
        long time2 = LocalDateTime.now().toInstant(ZoneOffset.of("+8")).toEpochMilli();
        long time3 = Calendar.getInstance().getTimeInMillis();
        System.out.println(time0);
        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time3);
    }

}
