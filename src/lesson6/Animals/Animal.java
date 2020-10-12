package lesson6.Animals;

public class Animal {
    String name;
    String color;
    int age;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void run(int distance){
        int maxDistance = 0;
        if (distance <= maxDistance) {
        System.out.printf("%s пробежал %d метров\n", name, distance);
        } else {
            System.out.printf("%s не пробежал %d метров\n", name, distance);
        }
    }

    public void swim(int distance){
        int maxDistance = 0;
        if (distance <= maxDistance) {
            System.out.printf("%s  проплыл %d метров\n", name, distance);
        } else {
            System.out.printf("%s не проплыл %d метров\n", name, distance);
        }
    }
}
