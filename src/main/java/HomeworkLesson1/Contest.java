package HomeworkLesson1;

public class Contest {
    public static void main(String[] args) {
        Skills[] team = {new Cat("Барсик", 6000,70),
                new Human("Билл",4000,150),
                new Robot("Оптимус Прайм",8000, 40)
        };
        Obstacle[] obstacles = {new Wall(50),
                new Racetrack(3800),
                new Wall(90),
                new Racetrack(6000),
                new Wall(120),
                new Racetrack(6000)
        };
        for (int i = 0; i < team.length ; i++) {
            for (int j = 0; j < obstacles.length ; j++) {
                obstacles[j].passingObstacle(team[i]);
                if (!team[i].winObstacle()) break;
            }
        }
    }
}
