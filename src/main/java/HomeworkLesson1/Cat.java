package HomeworkLesson1;

public  class Cat implements Skills{
    private String name;
    private int runLimit;
    private int jumpLimit;
    boolean obstaclePassed;

    public Cat(String name,int runLimit, int jumpLimit) {
        this.name="Кот " + name;
        if(runLimit <=5000 && runLimit>0){
            this.runLimit = runLimit;
        }
        if(jumpLimit<=100 && jumpLimit>0) {
            this.jumpLimit = jumpLimit;
        }
    }

    @Override
    public void run(int distance) {
        if(runLimit>= distance){
            obstaclePassed = true;
           System.out.println("Кот " +name +" преодолел дистанцию "+distance + " см");
        }
        obstaclePassed = false;
        System.out.println("Кот " +name +" не смог преодолеть дистанцию "+distance + " см");
    }

    @Override
    public void jump(int height) {
        if (jumpLimit>=height){
            obstaclePassed = true;
            System.out.println("Кот  " +name +" перепрыгнул через стену высотой "+height + " см");
        }
        obstaclePassed = false;
        System.out.println("Кот " +name +" не смог перепрыгнуть через стену высотой "+height + " см");
    }
}
