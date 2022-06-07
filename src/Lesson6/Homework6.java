package Lesson6;


public class Homework6 {
    public static void main(String[] args) {
        Animal animal = new Animal(55, 8);
        Cat cat = new Cat(100, 5);
        Dog dog = new Dog(150,8);
        animal.info();
        cat.infoCat();
        dog.infoDog();
    }
}
