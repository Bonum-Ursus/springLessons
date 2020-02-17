package annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class FootballCoach implements Coach{

    @Autowired
    @Qualifier("oneMoreFortuneService")
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
