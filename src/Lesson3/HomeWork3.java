package Lesson3;

import java.util.Random;

public class HomeWork3 {
    public static void main(String[] args) {
        arr(3,7);

        int[] number = new int[10];
        Random random = new Random();
        for (int i = 0; i < number.length; i++) {
            number[i] = random.nextInt(2);
            ;
            if (number[i] == 1) {
                number[i] = 0;
            } else {
                number[i] = 1;
            }
        }



        int[] num1 = new int[100];
        for (int i = 0; i < num1.length; i++) {
            num1[i] = i + 1;
        }



        int[] num2 = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < num2.length; i++) {
            if (num2[i] < 6) {
                num2[i] *= 2;
            }
        }



        int[][] num3 = new int[7][8];
        for (int i = 0; i < num3[0].length; i++) {
            num3[0][i] = 1;
            num3[num3.length-1][i] = 1;
        }
        for (int i = 0; i < num3.length; i++) {
            num3[i][0] = 1;
            num3[i][num3[i].length-1] = 1;
        }
        for (int i = 0; i < num3.length; i++) {
            for (int j = 0; j < num3[i].length; j++) {
                System.out.print(num3[i][j] + " ");
            }
            System.out.println();
        }



        int[] num4 = new int[random.nextInt(15)];
        int max = 0;
        int min = 0;
        for (int i = 0; i < num4.length; i++) {
            num4[i] = random.nextInt(90);
            if (max < num4[i]) {
                max = num4[i];
            }
        }
        min = max;
        for (int i = 0; i < num4.length; i++) {
            if (min > num4[i]) {
                min = num4[i];
            }
        }
        System.out.println(max + " " + min);

    }

    public static int[] arr(int len, int initialValue) {
        int[] arrays = new int[len];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = initialValue;
        }
        return arrays;
    }
}
