package lesson7;

public class Plate {
    private int food;
    private int extra;
    private Boolean fullness;


    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void decreaseFood(int amount) {
        if (amount < 0) {
            return;
        }
        if (amount >= food) {
            System.out.println("Not enough food");
            fullness = false;
            return;
        }
        fullness = true;
        food -= amount;

    }

    public void getFullness(Cat cat) {
        if (fullness == false) {
            System.out.println("Cat " + cat.getName() +  " doesn't full");
            return;
        }
        System.out.println("Cat " + cat.getName() + " is full");

    }

    public void extraFood(int extra) {
        food += extra;
        System.out.println("Owner puts " + extra + " more food");
    }

    @Override
    public String toString() {
        return "Plate{" +
                "food=" + food +
                '}';
    }


}
