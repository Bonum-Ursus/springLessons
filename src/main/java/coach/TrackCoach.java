package coach;

public class TrackCoach implements Coach{
    private FortuneService fortuneService;
    @Override
    public String getDailyWorkout() {
        return "Run Forest! Run!!";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
}
