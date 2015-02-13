package log;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Jason Bradley
 */
public abstract class Log {
    public static enum Level {INFO, ALERT, ERROR, CRITICAL, OTHER}
    private static DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
    private static String logFormat = "[%s] %s: %s";

    public abstract void debug(Log.Level level, String message);
    protected String generateLog(Log.Level level, String message) {
        Date now = new Date();
        return String.format(Log.logFormat, level, Log.dateFormat.format(now), message);
    }
}
