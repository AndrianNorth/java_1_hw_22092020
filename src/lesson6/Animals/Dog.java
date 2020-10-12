package lesson6.Animals;

public class Dog extends Animal {
    public Dog(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void run(int distance) {
        int maxDistance = 500;
        if (distance <= maxDistance) {
            System.out.printf("%s собака, он пробежал %d метров\n", name, distance);
        } else {
            System.out.printf("%s собака, он не пробежал %d метров\n", name, distance);
        }
    }

    @Override
    public void swim(int distance){
        int maxDistance = 10;
        if (distance <= maxDistance) {
            System.out.printf("%s собака, он проплыл %d метров\n", name, distance);
        } else {
            System.out.printf("%s собака, он не проплыл %d метров\n", name, distance);
        }
    }
}
