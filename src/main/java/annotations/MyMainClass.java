package annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.w3c.dom.ls.LSOutput;

public class MyMainClass {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("annot.xml");

        Coach coach = context.getBean("tennisCoach", Coach.class);
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());
        Coach coach2 = context.getBean("footballCoach", Coach.class);
        System.out.println(coach2.getDailyWorkout());
        System.out.println(coach2.getDailyFortune());

        System.out.println(
                context.getBean("computerScienceCoach", Coach.class).getDailyFortune());

        context.close();
    }
}
