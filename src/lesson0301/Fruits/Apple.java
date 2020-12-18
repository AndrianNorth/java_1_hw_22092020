package lesson0301.Fruits;

public class Apple extends Fruit {
        Object apples;
        final float AWEIGHT = 1.0f;

    public Apple(Object apples) {
        this.apples = apples;
    }

    public float getAWEIGHT() {
        return AWEIGHT;
    }
}
