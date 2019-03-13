package academy.learnprogramming;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class Main {

//    private static final Logger log = LoggerFactory.getLogger(Main.class); //<- replaced by @Slf4j lombok annotation

    public static void main(String[] args) {
        log.info("Guess The Number Game");
        SpringApplication.run(Main.class,args);

        // not needed with spring boot

//        // create context (container)
//        ConfigurableApplicationContext context
//                = new AnnotationConfigApplicationContext(GameConfig.class);
//
//
//        // close context (container)
//        context.close();


    }
}
