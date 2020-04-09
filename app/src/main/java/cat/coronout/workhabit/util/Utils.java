package cat.coronout.workhabit.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public abstract class Utils {

    public static Calendar getCalendarFromDate(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar;
    }

    public static Date getDateFromCalendar(Calendar calendar) {
        return calendar.getTime();
    }

    public static String getUserDateFormat(Date date) {
        if (date == null)
            return "";
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
        return format.format(date);
    }

    public static String getLocalStorageDateFormat(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        return format.format(date);
    }

    public static String getUserHour(int hour, int minute) {
        String finalHour = "";
        if (hour < 10) finalHour += ("0" + hour);
        else finalHour += hour;
        finalHour += ":";
        if (minute < 10) finalHour += ("0" + minute);
        else finalHour += minute;
        return finalHour;
    }

}
