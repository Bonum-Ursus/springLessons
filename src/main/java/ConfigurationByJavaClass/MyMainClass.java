package ConfigurationByJavaClass;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyMainClass {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        SwimCoach coach = context.getBean("swimCoach", SwimCoach.class);
        System.out.println(coach.getDailyFortune());
        System.out.println(coach.getName());
        System.out.println(coach.getEmail());
    }
}
