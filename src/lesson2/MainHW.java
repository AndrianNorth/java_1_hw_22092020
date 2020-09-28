package lesson2;

import java.util.Arrays;

public class MainHW {

    public static void main(String[] args) {
    binaryNumbers();
    pushArray();
    lessThanSix();
    diagonalFill();
    minMax();
    }

    public static void binaryNumbers() {
        int[] arr = {0, 0, 1, 1, 0, 0, 1, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) arr[i] = 1;
            else arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void pushArray() {
        int[] arr = new int[8];
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
                arr[i] = j += 3;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void lessThanSix() {
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void diagonalFill() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i + j == arr.length - 1) {
                    arr[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.printf("%-3d", arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void minMax() {
        int[] arr = {2, 10, 7, 21, 56, 37, 82};
        Arrays.sort(arr);
        System.out.printf("min = %d; max = %d ", arr[0], arr[6]);
    }
}
