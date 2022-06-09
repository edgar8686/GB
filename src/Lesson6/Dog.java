package Lesson6;

public class Dog extends Animal {
    public Dog(int run, int swim) {
        super(run, swim);
    }
    public void infoDog() {
        System.out.println("бег: собака макс. 500м - " + getRun() + ", " + "плавание: собака макс. 10м - " + getSwim());
    }
}
