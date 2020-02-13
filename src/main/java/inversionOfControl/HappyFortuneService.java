package inversionOfControl;

public class HappyFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "Per aspera ad astra";
    }
}
