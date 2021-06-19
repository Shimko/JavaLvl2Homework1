package HomeworkLesson1;

public class Human implements Skills{
    private String type;
    private String name;
    private int runLimit;
    private int jumpLimit;
    private boolean winObstacle;


    public Human(String type, String name, int runLimit, int jumpLimit) {
        this.type = type;
        this.name = name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
        this.winObstacle = false;

    }



    @Override
    public void run(Racetrack distance) {
        if(winObstacle) {
            if (runLimit >= distance.getDistance()) {
                winObstacle = true;
                System.out.println("Человек " + name + " удачно пробежал "+ distance);
            }
            else {winObstacle = false;
            System.out.println("Человек " + name + "  не смог пробежать " + distance);
            }
        }

    }

    @Override
    public void jump(Wall height) {
        if (jumpLimit >= height.getHeight()){
            winObstacle = true;;
            System.out.println("Человек "+ name + " удачно перепрыгнул через стену высотой  " + height.getHeight());
        }
        else {
            winObstacle = false;
            System.out.println("Человек "+ name + " не смог перепрыгнуть через стену высотой  " +height);
        }
    }
    @Override
    public boolean winObstacle() {
        return winObstacle;
    }

    @Override
    public void result() {
        if (winObstacle() == true)
            System.out.println(type +" " + name + ":" + " преодолел препятствие" );
        else {
            System.out.println(type +" " + name + ":" + " не смог преодолеть препятствие" );
        }
    }
}
