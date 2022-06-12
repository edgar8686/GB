package Lesson7;

public class Homework7 {
    public static void main(String[] args) {
        Plate plate = new Plate(200);
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Нептун", 65);
        cats[1] = new Cat("Марс", 75);
        cats[2] = new Cat("Барон", 90);
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            cats[i].info();
        }
        plate.addEat(30);
        plate.info();
    }
}
