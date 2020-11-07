package lesson0201;

import lesson0201.Obstacles.Obstacle;
import lesson0201.Obstacles.Track;
import lesson0201.Obstacles.Wall;

public class Main {

    public static void main(String[] args) {
        Competitor[] competitors = {
                new Human("John", 1, 650),
                new Cat("Murzik", 4, 100),
                new Robot("Jacob", 15, 15000)
        };

        Obstacle[] obstacles = {
                new Track(600),
                new Wall(2)
        };

        for (Competitor c: competitors) {
            for (Obstacle o: obstacles) {
                o.doIt(c);
                if (!c.isOnDistance()){
                    break;
                }
            }
        }
    }
}
