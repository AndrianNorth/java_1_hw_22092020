package lesson0301;

import java.util.Arrays;
import java.util.List;

public class Nums<T> {
    private T[] nums;

    public Nums(T... nums) {
        this.nums = nums;
    }

    public T[] getNums() {
        return nums;
    }

    public void setNums(T[] nums) {
        this.nums = nums;
    }

    public static <T> void swapPlace(T[] arr, int firstPosition, int secondPosition) {
        T x = arr[firstPosition];
        arr[firstPosition] = arr[secondPosition];
        arr[secondPosition] = x;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static <T> void arrToList(T[] arr){
        List<T> list = Arrays.asList(arr);
        System.out.println(list);
    }
}
