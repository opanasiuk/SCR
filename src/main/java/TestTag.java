import org.springframework.boot.SpringApplication;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Vitaliy on 16.11.2015.
 */
public class TestTag {

    private final static Logger logger = Logger.getGlobal();
    public static void main(String[] args) {
        SpringApplication.run(TestTag.class,args);
        logger.log(Level.INFO, "[TAG] :" + GitInfo.TAG);
    }

}
