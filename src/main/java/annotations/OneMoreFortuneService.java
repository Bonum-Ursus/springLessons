package annotations;

import org.springframework.stereotype.Component;

@Component
public class OneMoreFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "Just do it!";
    }
}
