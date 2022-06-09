package Lesson4_Project_X_Y;

import java.util.Scanner;
import java.util.Random;

public class ProjectXY {
    public static void main(String[] args) {
        String[][] field = inField(3);
        printStr(field);
        while (true) {
            movePlayer(field);
            printStr(field);
            if (draw(field)){
                break;
            }
            if (winner(field, "X")) {
                System.out.println("Выиграл человек");
            }
            moveAi(field);
            printStr(field);
            if (draw(field)) {
                break;
            }
            if (winner(field, "Y")) {
                System.out.println("Выиграл компьютер");
            }


}
        System.out.println("Игра окончена");

    }

    public static String[][] inField(int a) {
        String[][] field = new String[a][a];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                field[i][j] = "*";
            }
        }
        return field;
    }

    public static void printStr(String[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("------");
    }
    public static void movePlayer(String[][] field) {
        Scanner console = new Scanner(System.in);
        while (true) {
            System.out.println("Ход игрока");
            int a = console.nextInt()-1;
            int b = console.nextInt()-1;
            int size = field.length;
            if (a < size && b < size && a >= 0 && b >= 0) {
                if (field[a][b].equals("*")) {
                    field[a][b] = "X";
                    break;
                } else {
                    System.out.println("Ты тыкнул не туда");
                    }
                } else {
                    System.out.println("Вышел за пределы поля, нормально тыкни по братски");
                }
            }
        }
        public static void moveAi(String[][] field) {
            Scanner console = new Scanner(System.in);
            while (true) {
                Random random = new Random();
                int a = random.nextInt(field.length);
                int b = random.nextInt(field.length);
                if (field[a][b].equals("*")) {
                    field[a][b] = "Y";
                    break;
                }
            }
            System.out.println("Компьютер сходил");
        }
        public static boolean draw(String[][] field) {
         for(int i = 0; i < field.length; i++) {
             for (int j = 0; j < field[0].length; j++) {
                 if (field[i][j].equals("*")) {
                     return false;
                 }
             }
         }
         return true;
        }
        public static boolean winner(String[][] field, String turn) {
            if (field[0][0].equals(turn) && field[0][1].equals(turn) && field[0][2].equals(turn) ||
                    field[1][0].equals(turn) && field[1][1].equals(turn) && field[1][2].equals(turn) ||
                    field[2][0].equals(turn) && field[2][1].equals(turn) && field[2][2].equals(turn)
            ) {
                return true;
            }
            else if (field[0][0].equals(turn) && field[1][0].equals(turn) && field[2][0].equals(turn) ||
                    field[0][1].equals(turn) && field[1][1].equals(turn) && field[2][1].equals(turn) ||
                    field[0][2].equals(turn) && field[1][2].equals(turn) && field[2][2].equals(turn)) {
                return true;
            }
            else if (field[0][0].equals(turn) && field[1][1].equals(turn) && field[2][2].equals(turn) ||
                    field[2][0].equals(turn) && field[1][1].equals(turn) && field[0][2].equals(turn)) {
                return true;
            }

            return false;
        }



            }



