package Lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void  checkSumSign() {
        int a = 20;
        int b = 30;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor() {
        int value = 15;
        if (value <= 0) {
            System.out.println("Красный");
        }  else if (value <= 100 && value > 0) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers() {
        int a = 13;
        int b = 36;
        if (a >= b) {
            System.out.println("a >= b");

        } else {
            System.out.println("a < b");
        }
    }
}

