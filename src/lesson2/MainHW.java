package lesson2;

import java.util.Arrays;

public class MainHW {
    // Сдаю что успел, постараюсь сделать со звездочками другие задания
    public static void main(String[] args) {
        binaryNumbers();
        pushArray();
        lessThanSix();
        diagonalFill();
//    printArr(factoryArr(10));
        minMax();
    }

    public static void binaryNumbers() {
        int[] arr = {0, 0, 1, 1, 0, 0, 1, 1};
        for (int i = 0; i < arr.length; i++) {
//            arr[i] = arr[i] == 0 ? 1 : 0; или
//            arr[i] = 1 - arr[i];
            if (arr[i] == 0) arr[i] = 1;
            else arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void pushArray() {
        int[] arr = new int[8];
        for (int i = 0, j = 0; i < arr.length; i++, j += 3) {
//                arr[i] = i * 3
            arr[i] = j;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void lessThanSix() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
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

//    public static int[][] factoryArr(int n) {
//        int[][] arr = new int[n][n];
//        for (int i = 0; i < n; i++) {
//            arr[i][i] = 1;
//            arr[i][n - 1 - i] = 1;
//        }
//
//        или
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (i == j || i + j == n - 1) {
//                    arr[i][j] = 1;
//                }
//            }
//    }

//    }
//
//    public static void printArr(int[][] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.println(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }


    public static void minMax() {
//        int max = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//            return max
//        }
        int[] arr = {2, 10, 7, 21, 56, 37, 82};
        Arrays.sort(arr);
        System.out.printf("min = %d; max = %d ", arr[0], arr[6]);
    }

//    int[] arr = {2, 2, 2, 1, 2. 2. 10. 1};
//    System.out.printf(checkBalance(arr));
//
//    public static boolean checkBalance(int[] arr) {
//        int summ = 0;
//        for (int i = 0; i < arr.length; i++) {
//            summ+= arr[i];
//        }
//        if (summ % 2 != 0) {
//            return false;
//        }
//        int sumLeft = 0;
//        int i = 0;
//        while (sumLeft < summ / 2) {
//            sumLeft += arr[i];
//            i++;
//        }
//        return sumLeft == summ / 2;
//    }


//    public static int[] shiftArr(int[] arr, int n) {
//        int k = n % arr.length + arr.length;
//        for (int i = 0; i < k; i++) {
//            int tmp = arr[arr.length - 1];
//            for (int j = arr.length - 1; j > 0; j--) {
//                arr[j] = arr[j - 1];
//            }
//            arr[0] = tmp;
//        }
//        return arr;
//    }

}
