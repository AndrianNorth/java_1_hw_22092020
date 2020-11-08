package lesson0201.Obstacles;

import lesson0201.Competitor;
import lesson0201.Obstacles.Obstacle;

public class Track implements Obstacle {
    private int dist;

    public Track(int dist) {
        this.dist = dist;
    }

    @Override
    public void doIt(Competitor c) {
        c.run(dist);
    }
}

