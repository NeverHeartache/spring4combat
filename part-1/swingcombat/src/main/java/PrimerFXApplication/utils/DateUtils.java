package PrimerFXApplication.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    public static String getNowTimeStr(String pattern){
        return new SimpleDateFormat(pattern).format(new Date());
    }

}
