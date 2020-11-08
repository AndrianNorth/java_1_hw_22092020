package lesson0201;

public class Robot implements Competitor{
    private String name;
    private int maxHeight;
    private int maxDistance;
    private boolean onDistance = true;

    public Robot(String name, int maxHeight, int maxDistance) {
        this.name = name;
        this.maxHeight = maxHeight;
        this.maxDistance = maxDistance;
    }

    @Override
    public void run(int dist) {
        if (dist <= maxDistance) {
            System.out.printf("%s пробежал %d метров\n", name, dist);
        } else {
            System.out.printf("%s не пробежал %d метров\n", name, dist);
            onDistance = false;
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxHeight) {
            System.out.printf("%s прыгнул на %d метров\n", name, height);
        } else {
            System.out.printf("%s не прыгнул %d метров\n", name, height);
            onDistance = false;
        }
    }

    @Override
    public boolean isOnDistance() { return onDistance; }
}
