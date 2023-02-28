package webTests;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateHours {
    public static String datehoursBMS() {
        String dateHours = new SimpleDateFormat("yyyy-MM-dd_HH_mm").format(Calendar.getInstance().getTime());
        return dateHours;
    }
}



