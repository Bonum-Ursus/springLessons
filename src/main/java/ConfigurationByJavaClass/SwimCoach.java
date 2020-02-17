package ConfigurationByJavaClass;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach{
    FortuneService fortuneService;
    @Value("${example.email}")
    private String email;
    @Value("${example.name}")
    private String name;

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim for 30 min";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
