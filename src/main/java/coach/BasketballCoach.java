package coach;

public class BasketballCoach implements Coach{
    private FortuneService fortuneService;
    @Override
    public String getDailyWorkout() {
        return "Throw ball in basket for 100 times.";
    }

    @Override
    public String getFortune(){
        return fortuneService.getFortune();
    }

    public BasketballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
}
