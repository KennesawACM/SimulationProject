package log;

/**
 * @author Jason Bradley
 */
public class OtherLog extends Log {
    @Override
    public void debug(Level level, String message) {
        //TODO: Handle specific implementation of this
        //i.e. Add log line to file or file buffer
        System.out.println(super.generateLog(level, message));
    }
}
