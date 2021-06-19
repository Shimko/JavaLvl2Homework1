package HomeworkLesson1;

public class Racetrack implements Obstacle{
    private int distance;

    public Racetrack(int distance) {
        this.distance = distance;
    }

    @Override
    public void passingObstacle(Skills skills) {
        skills.winObstacle();

    }

    public int getDistance() {
        return distance;
    }
}
