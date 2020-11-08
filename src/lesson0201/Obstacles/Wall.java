package lesson0201.Obstacles;

import lesson0201.Competitor;
import lesson0201.Obstacles.Obstacle;

public class Wall implements Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Competitor o) {
        o.jump(height);
    }
}
