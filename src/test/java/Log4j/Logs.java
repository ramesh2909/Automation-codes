package Log4j;


 import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.*;

public class Logs {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Logger log = LogManager.getLogger();
		
		log.info("this is info");
		log.error("this is eror");
		log.fatal("this is fatal");
		log.warn("this ia warning");
	}

}
