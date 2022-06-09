package Lesson6;

public class Cat extends Animal {
    public Cat(int run, int swim) {

        super(run, swim);
    }
    public void infoCat() {
        System.out.println("бег: кот макс. 200м - " + getRun() + ", " + "кот плавать не умеет ");
    }
}
