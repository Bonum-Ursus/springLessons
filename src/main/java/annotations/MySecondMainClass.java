package annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySecondMainClass {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("annot.xml");

        Coach coach1 = context.getBean("footballCoach", Coach.class);
        Coach coach2 = context.getBean("footballCoach", Coach.class);
        System.out.println(coach1 == coach2);
        System.out.println(coach1.hashCode() + " " + coach2.hashCode());
        context.close();
    }
}
