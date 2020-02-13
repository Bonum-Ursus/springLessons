package inversionOfControl;

public class BasketballCoach implements Coach{
    private FortuneService fortuneService;
    private String className = BasketballCoach.class.getName();

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String getDailyWorkout() {
        return "Throw ball in basket for 100 times.";
    }

    @Override
    public String getFortune(){
        return fortuneService.getFortune();
    }

    @Override
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public BasketballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
}
