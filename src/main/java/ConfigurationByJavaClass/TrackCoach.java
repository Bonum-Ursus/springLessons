package ConfigurationByJavaClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{
    FortuneService fortuneService;

    @Autowired
    public TrackCoach(@Qualifier("mainFortune")FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run Forest! RUN!!!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
