package common;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Jason Bradley
 */
public class Log {
    private static DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
    public static void debug(String message) {
        Date now = new Date();
        System.out.println(String.format("%s: %s", Log.dateFormat.format(now), message));
    }

    public static <T extends Exception> void error(Class<T> exceptionType, String message) {
        Date now = new Date();
        String formattedMessage = String.format("%s: %s", Log.dateFormat.format(now), message);
        try {
            T newException = (T)exceptionType.getDeclaredConstructor(new Class[] {String.class}).newInstance(formattedMessage);
            throw newException;
        } catch (Exception e) {
            throw new RuntimeException(formattedMessage);
        }
    }

    public static void error(String message) {
        Date now = new Date();
        String formattedMessage = String.format("%s: %s", Log.dateFormat.format(now), message);
        throw new RuntimeException(formattedMessage);
    }
}
