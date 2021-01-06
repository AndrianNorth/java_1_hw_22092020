package lesson0305;

public class Car implements Runnable {
    private static int CARS_COUNT;
    private static int PLACE = 0;

    static {
        CARS_COUNT = 0;
    }
    private Race race;
    private int speed;
    private String name;

    public String getName() {
        return name;
    }
    public int getSpeed() {
        return speed;
    }
    public Car(Race race, int speed) {
        this.race = race;
        this.speed = speed;
        CARS_COUNT++;
        this.name = "Участник #" + CARS_COUNT;
    }


    @Override
    public void run() {
        try {
            System.out.println(this.name + " готовится");
            Thread.sleep(500 + (int)(Math.random() * 800));
            System.out.println(this.name + " готов");
            Thread.sleep(1000);

        } catch (Exception e) {
            e.printStackTrace();
        }

        for (int i = 0; i < race.getStages().size(); i++) {
            race.getStages().get(i).go(this);
        }
        PLACE ++;
        if(PLACE == 1) {
            System.out.println(this.name + " ПОБЕДИТЕЛЬ!");
        } else {
            System.out.println(this.name + " закончил на " + PLACE + " месте!");
        }
    }
}
