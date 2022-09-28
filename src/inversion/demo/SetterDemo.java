package inversion.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CricketCoach coach = context.getBean("myCricketCoach", CricketCoach.class);

        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());
        System.out.println(coach.getEmailAddress());
        System.out.println(coach.getTeam());

        CricketCoach coach2 = context.getBean("myCricketCoach", CricketCoach.class);

        System.out.println(coach2.getEmailAddress());
        coach.setEmailAddress("outroemail@gmail.com");
        System.out.println(coach2.getEmailAddress());
    }
}
