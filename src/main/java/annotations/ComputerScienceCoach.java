package annotations;

import org.springframework.stereotype.Component;

import java.io.*;
@Component
public class ComputerScienceCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Study spring for 8 hours";
    }

    @Override
    public String getDailyFortune()  {
        String fortune;
        try {
            BufferedReader bfr =
                    new BufferedReader(
                            new FileReader(
                                    new File("src/main/resources/fortuneText.txt")));
            fortune = bfr.readLine();
            return fortune;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
