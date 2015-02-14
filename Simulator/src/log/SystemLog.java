package log;

public class SystemLog extends Logger{
	private int LogLevel;
	private String Message, SysTime, MessageID, Location;
	public SystemLog(int level, String Class, String method, String message) {
		this.LogLevel = level;
		this.Location = Class + " : " + method;
		this.Message = message;
		
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
