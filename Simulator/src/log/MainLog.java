package log;

/**
 * @author Jason Bradley
 */
public class MainLog extends Log {
    @Override
    public void debug(Level level, String message) {
        //TODO: Handle specific implementation of this
        System.out.println(super.generateLog(level, message));
    }
}
