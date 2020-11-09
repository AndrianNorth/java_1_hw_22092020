package lesson0202;

public class Main {
    public static void main(String[] args) {
        String[][] arr = {
                {"9", "2", "3", "37"},
                {"15", "4", "9", "35"},
                {"8", "5", "10", "21"},
                {"23", "46", "16", "71"}
        };

        String[][] arrSizeErr = {
                {"9", "2", "3"},
                {"15", "4", "9"},
                {"8", "5", "10"},
                {"23", "46", "16"}
        };

        String[][] arrSymbol = {
                {"9", "2", "3", "#"},
                {"15", "4", "9", "35"},
                {"8", "5", "10", "%"},
                {"23", "46", "16", "71"}
        };

        try {
            System.out.println(sum(arrSizeErr));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            System.out.println("Массив не соответствует размеру 4х4");
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            System.out.println("Ошибка преобразования элемента массива в число");
        }
    }

    public static int sum(String[][] arr) throws NumberFormatException{
        int sumOfCell = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
               sumOfCell += Integer.parseInt(arr[i][j]);
            }
        } return sumOfCell;
    }
}
