package inversion.demo;

public class BasketballCoach implements Coach{

    private FortuneService fortuneService;

    public BasketballCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "30 points";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getDailyFortune();
    }

    public void initMethod(){
        System.out.println("init basketballCoach");
    }

    public void destroyMethod(){
        System.out.println("destroy basketballCoach");
    }
}
