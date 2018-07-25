import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Frequent implements Runnable{
    final static Logger logger = LogManager.getLogger(Frequent.class);
    @Override
    public void run() {
        System.out.println("Starting");
        while (true) {
            logger.info("Hello world");
        }
    }
}
