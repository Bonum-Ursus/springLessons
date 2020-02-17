package annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
    @Autowired
    @Qualifier("happyFortuneService")
    private FortuneService fortuneService;
//    By constructor
//    @Autowired
//    public TennisCoach(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }

    @Override
    public String getDailyWorkout() {
        return "Play 10 sets";
    }

    @Override
    public String getDailyFortune(){
        return fortuneService.getFortune();
    }

//    By Setter
//    @Autowired
//    public void setFortuneService(FortuneService fortuneService){
//        this.fortuneService = fortuneService;
//    }

}
