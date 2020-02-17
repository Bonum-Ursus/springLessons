package ConfigurationByJavaClass;

import org.springframework.stereotype.Component;

@Component
public class MainFortune implements FortuneService{
    @Override
    public String getFortune() {
        return "Everything is OK!";
    }
}
