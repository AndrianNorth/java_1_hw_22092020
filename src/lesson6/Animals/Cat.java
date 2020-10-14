package lesson6.Animals;

public class Cat extends Animal {
    public Cat(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void run(int distance) {
        int maxDistance = 200;
        if (distance <= maxDistance) {
            System.out.printf("%s кот, он пробежал %d метров\n", name, distance);
        } else {
            System.out.printf("%s кот, он не пробежал %d метров\n", name, distance);
        }
    }

    @Override
    public void swim(int distance){
        System.out.printf("%s кот. Коты не умеют плавать\n", name);
        }
}
