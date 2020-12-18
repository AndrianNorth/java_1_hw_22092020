package lesson0301.Fruits;

public class Box implements Comparable<Box> {
    private int size;

    @Override
    public int compareTo(Box o) {
        return this.size - o.size;
    }
}
