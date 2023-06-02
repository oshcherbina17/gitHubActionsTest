import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.lang.invoke.MethodHandles;

class HelloWorld {
  
    public static void main(String[] args) {
        private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

        System.out.println("Hello, World!"); 
        LOGGER.info("test");
    }
}
