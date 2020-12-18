package lesson0301.Fruits;

public class Orange extends Fruit {
        Object oranges;
        final float OWEIGHT = 1.5f;

    public Orange(Object oranges) {
        this.oranges = oranges;
    }

    public float getOWEIGHT() {
        return OWEIGHT;
    }
}
