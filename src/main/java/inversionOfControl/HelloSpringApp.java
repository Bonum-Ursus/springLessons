package inversionOfControl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext  context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        BasketballCoach theCoach = context.getBean("myCoach", BasketballCoach.class);
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getFortune());
        System.out.println(theCoach.getClassName());
        context.close();
    }
}
