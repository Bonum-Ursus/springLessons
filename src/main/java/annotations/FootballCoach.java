package annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope() //by default singleton. Can change on "prototype".
public class FootballCoach implements Coach{

//    @Autowired
//    @Qualifier("oneMoreFortuneService")
    private FortuneService fortuneService;

//    By constructor
    @Autowired
    public FootballCoach(@Qualifier("oneMoreFortuneService")FortuneService fortuneService) {
        System.out.println("Constructor");
        this.fortuneService = fortuneService;
    }

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

    @PostConstruct
    public void construct(){
        System.out.println("PostConstruct method");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("PreDestroy method");
    }
}
