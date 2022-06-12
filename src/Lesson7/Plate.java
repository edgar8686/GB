package Lesson7;

public class Plate {
    private int food;

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public Plate(int food) {
        this.food = food;
    }

    public void decrisefood(int appetite) {
        food -= appetite;
    }
    public void addEat(int cats) {
            food = getFood() + cats;
    }
    public void info() {
        System.out.println(getFood());
    }
}
