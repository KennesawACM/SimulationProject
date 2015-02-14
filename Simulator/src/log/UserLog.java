package log;

//Only Should be accessed by Logger class
//User Logs should go here
class UserLog extends Logger{
	private int LogLevel;
	private String Message, SysTime, MessageID, Header;
	
	/**
	 * @author mr7657
	 * @category Constructor
	 * @param level
	 * @param message
	 * @param header
	 */
	public UserLog(int level, String header, String message){
		this.LogLevel = level;
		this.Message = message;
		this.Header = header;
		
		//Choose Log Level
		if(ChooseLevel())
			//For now Print to con
			System.out.println("Message Logged, Message ID: " + this.MessageID);
		else{
			//false Failed
			System.out.println("Error, Message Not Logged, Please Contact the Backend Team");
			
			//Throw Exception
		}
	}
	
	/**
	 * @author mr7657
	 * @param None
	 * @summary This will check which log level and then calls that method
	 * @return Boolean: Valid Level
	 */
	private boolean ChooseLevel(){
		boolean returnValue = false;
		switch(this.LogLevel){
		case 1:
			//Debug
		case 2:
			//Info
		case 3:
			//Warning
		case 4:
			//Error
		case 5:
			//Fatal
		case 6:
			//Off
		}
		return returnValue;
	}

}
