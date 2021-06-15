package HomeworkLesson1;

public class Racetrack extends Obstacle{
    private int  distance;

    public Racetrack(int distance) {
        this.distance = distance;
    }

    @Override
    public void passingObstacle(Skills skills) {
        skills.run(distance);
    }
}
