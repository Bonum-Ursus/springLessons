package ConfigurationByJavaClass;

public class FireFortune implements FortuneService{
    @Override
    public String getFortune() {
        return "Fire up!";
    }
}
