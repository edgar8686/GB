package Lesson2;

public class HomeWork2 {
    public static void main(String[] args) {
    number(5,12);
    positiv(-3);
    trueOrFalse(-10);
    word("error",5);
    leapYear(4);

    }
    public static boolean number(int num1, int num2) {


        if (num1 + num2 >= 10 && num1 + num2 <= 20) {
            return true;
        } else {
            return false;
        }


    }
    public static void positiv(int number) {
        if (number >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }
    public static boolean trueOrFalse(int a) {
        boolean number = true;
        if (a < 0) {
            number = true;
        } else if (a >= 0) {
            number = false;
        }
        return number;
    }
    public static void word(String str, int x) {
        for (int i = 0; i < x; i++) {
            System.out.println(str);
        }
    }
    public static boolean leapYear(int year) {
      if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
          return true;
      } else {
          return false;
      }
    }
}
