package log;

public class Logger {
	/**
	 * @author mr7657
	 * @summary Default
	 * @category Constructor 
	 */
	public Logger() {
		// This creates a new case of log
		// In this case they do not care to hand addresses,
		// we will make the default locations
	}

	/**
	 * @author mr7657
	 * @summary If there is a location 
	 * @category Constructor 
	 * @param location
	 */
	public Logger(String location){
		//If there is a file location to append to
	}
	
	/**
	 * @author mr7657
	 * @summary Creates a user log
	 * @see VaildLevel(int)
	 * @param level
	 * @param header
	 * @param message
	 * @return
	 */
	public static boolean UserLog(int level, String header, String message) {
		// Test Value
		if(!VaildLevel(level))
			return false;
		
		// Send To User Log
		try {
			@SuppressWarnings("unused")
			UserLog user = new UserLog(level, header, message);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	/**
	 * @author mr7657
	 * @summary Checks to see if the int value is in the valid range
	 * @param level
	 * @return
	 */
	private static boolean VaildLevel(int level){
		if(level > 0 && level < 7)
			return true;
		return false;
	}
}
