package lesson7;

public class Main {
    public static void main(String[] args) {
        Cat[] cat = {
                new Cat("Barsik"),
                new Cat("Murzik"),
                new Cat("Musya"),
                new Cat("Matroskin"),
        };

        Plate plate = new Plate(100);

        for (Cat value : cat) {
            value.eat(plate);
            plate.getFullness(value);
            System.out.println(plate);
        }

        plate.extraFood(100);


    }
}
