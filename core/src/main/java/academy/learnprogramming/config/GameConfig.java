package academy.learnprogramming.config;

import academy.learnprogramming.GuessCount;
import academy.learnprogramming.MaxNumber;
import academy.learnprogramming.MinNumber;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:config/game.properties")
@ComponentScan(basePackages = "academy.learnprogramming") // scans for @components in core AND console
public class GameConfig {

   // @Value("${game.maxNumber:25}") // default value(25) <- will be used if no matching values found in game.properties file
    @Value("${game.maxNumber:100}")
    private int maxNumber;
    @Value("${game.minNumber:0}")
    private int minNumber;
    @Value("${game.guessCount:10}")
    private int guessCount;


    @Bean
    @MaxNumber
    public int maxNumber(){
        return maxNumber;
    }

    @Bean
    @MinNumber
    public int minNumber(){
        return minNumber;
    }

    @Bean
    @GuessCount
    public int guessCount(){
        return guessCount;
    }





}



