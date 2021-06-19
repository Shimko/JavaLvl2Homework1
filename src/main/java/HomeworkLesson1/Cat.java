package HomeworkLesson1;

public  class Cat implements Skills{
    private String type;
    private String name;
    private int runLimit;
    private int jumpLimit ;
    private boolean  winObstacle;

    public Cat(String type, String name, int runLimit, int jumpLimit) {
        this.type = type;
        this.name = name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
        this.winObstacle = true;


    }



    @Override
    public void run(Racetrack distance) {
        if(runLimit>= distance.getDistance()){
           winObstacle = true;;
            System.out.println("Кот "+ name + " удачно пробежал " +distance);
        }
        else {
            winObstacle = false;
        System.out.println("Кот "+ name + " не смог пробежать " +distance);
        }
    }

    @Override
    public void jump(Wall height) {
        if(winObstacle) {
            if (jumpLimit >= height.getHeight()) {
                winObstacle = true;
                System.out.println("Кот " + name + " удачно перепрыгнул через стену высотой  " + height);
            }
            else {
            winObstacle = false;
            System.out.println("Кот " + name + " не смог перепрыгнуть  через стену высотой  " + height);
            }
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
