package inversion.demo;

public class HappyFortuneService implements FortuneService{

    private String[] arr;

    public String[] getArr() {
        return arr;
    }

    public void setArr(String[] arr) {
        this.arr = arr;
    }

    @Override
    public String getDailyFortune() {
        return arr[(int)(Math.random() * 3)];
    }
}
