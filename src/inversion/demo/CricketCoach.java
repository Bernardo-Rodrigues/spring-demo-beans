package inversion.demo;

public class CricketCoach implements Coach{

    private FortuneService fortuneService;
    private String emailAddress;

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    private String team;

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "Cricket";
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
