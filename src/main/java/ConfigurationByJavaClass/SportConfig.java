package ConfigurationByJavaClass;

import org.springframework.context.annotation.*;
import org.w3c.dom.ls.LSOutput;

@Configuration
@ComponentScan("ConfigurationByJavaClass")
@PropertySource("sport.properties")
public class SportConfig {
    @Bean
    public FortuneService fireFortune(){
        return new FireFortune();
    }

    @Bean
    public Coach swimCoach(){
        return new SwimCoach(fireFortune());
    }

}
