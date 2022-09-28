package inversion.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyAppSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("lifeCycleApplicationContext.xml");
        Coach coach = context.getBean("myCoach", Coach.class);

        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());

        Coach coach2 = context.getBean("myCoach", Coach.class);

        context.close();
    }
}
