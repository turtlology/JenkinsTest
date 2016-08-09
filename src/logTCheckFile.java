import java.util.logging.Logger;

public class logTCheckFile {
	private static Logger logger = Logger.getLogger(logTCheckFile.class.getName());
	public void loggingWithID(String nonsense) throws myException{
		logger.info("errorID:20160801 this is an error");
		return;
	}

	public void loggingWithoutID(String nonsens){
		try{
			logger.info("this is an error");
		}catch(NullPointerException e){
			logger.error("what",e);
		}
		return;
	}
	
	public void specific(){// Noncompliant {you didn't print the exception in the log}
		logger.info("only the logger");
		try{
			logger.info("this is an error");
		}catch(NullPointerException e){
			logger.info("without an exception");
		}
		return;
	}


}
