package HomeworkLesson1;

public class Contest {
    public static void main(String[] args) {
        Skills[] team = {new Cat("кот","Барсик", 6000,70),
                new Human("человек","Билл",4000,150),
                new Robot("робот","Оптимус Прайм",8000, 40),
                new Human("человек","Николай",3000,170),
        };
        Obstacle[] obstacles = {new Wall(50),
                new Racetrack(3800),
                new Wall(90),
                new Racetrack(6000),
                new Wall(120),
                new Racetrack(6000)
        };
        for (int i = 0; i < obstacles.length ; i++) {
            for (int j = 0; j < team.length ; j++) {
                team[j].result();

            }
            for (Skills player:team) {
                if(player.winObstacle()){
                    System.out.println(player.winObstacle());
                }
            }

        }
    }
}
