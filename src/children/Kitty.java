package children;

import java.util.logging.Logger;

import parent.Cat;

public class Kitty extends Cat{
	static String className = Kitty.class.getName();
	static Logger logger = Logger.getLogger(className);
	public void mew(){
		logger.info("mew mew mew");
	}
}
