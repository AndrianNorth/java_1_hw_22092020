package lesson6;

import lesson6.Animals.Cat;
import lesson6.Animals.Dog;

public class Main {
    public static void main(String[] args) {
        Cat catMurzik = new Cat("Murzik", "red", 100);
        Cat catMatroskin = new Cat("Matroskin", "white", 3);
        Dog dogTuzik = new Dog("Tuzik", "black", 15);
        Dog dogBobik = new Dog("Bobik", "Gray", 6);

        catMurzik.run(150);
        catMatroskin.run(201);
        dogTuzik.run(300);
        dogBobik.run(600);

        catMurzik.swim(7);
        catMatroskin.swim(9);
        dogTuzik.swim(9);
        dogBobik.swim(15);

    }
}
