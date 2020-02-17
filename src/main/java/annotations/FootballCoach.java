package annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{

    @Autowired
    private FortuneService fortuneService;
//    By constructor
//    @Autowired
//    public FootballCoach(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }

    @Override
    public String getDailyWorkout() {
        return "50 penalty kick";
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
