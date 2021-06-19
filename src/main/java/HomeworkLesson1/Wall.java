package HomeworkLesson1;

public class Wall implements Obstacle{
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void passingObstacle(Skills skills) {
        skills.winObstacle();
    }

    public int getHeight() {
        return height;
    }
}
