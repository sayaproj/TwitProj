package models.view;

import play.Play;
import utils.OptionUtil;
import static play.libs.F.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatter {

    private static final String defaultFormat = "MM/dd HH:mm";

    /**
     * 設定値app.models.view.defaultFormatに沿ったフォーマットを行う
     * @param date
     * @return
     */
    public static String formatDefaultDate(Date date) {
        String dateFormat = ConfigUtil.get("app.models.view.defaultFormat")
                .getOrElse(defaultFormat);
        return new SimpleDateFormat(dateFormat).format(date);
    }
}