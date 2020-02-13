package inversionOfControl;

public class BetterFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "Much better!";
    }
}
