package Lesson6;

public class Animal {
    private int run;
    private int swim;

    public int getRun() {
        return run;
    }

    public void setRun(int run) {

        this.run = run;
    }

    public int getSwim() {
        return swim;
    }

    public void setSwim(int swim) {

        this.swim = swim;
    }
    public Animal(int run, int swim) {
        this.run = run;
        this.swim = swim;

    }
    public void info(){
        System.out.println("run: " + getRun() + " " + "swim: " + getSwim());
    }
}
