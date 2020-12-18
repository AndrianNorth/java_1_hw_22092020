package lesson0301;

import static lesson0301.Nums.swapPlace;

public class Main {
    public static void main(String[] args) {

        Nums<Integer> arr1 = new Nums<>(1, 2, 3, 4, 5, 6);
        Nums<String> str1 = new Nums<>("a", "b", "c", "d", "e", "f");

        swapPlace(arr1.getNums(), 0, 4);
        swapPlace(str1.getNums(), 0, 4);

        Nums.arrToList(arr1.getNums());
        Nums.arrToList(str1.getNums());

    }




}

