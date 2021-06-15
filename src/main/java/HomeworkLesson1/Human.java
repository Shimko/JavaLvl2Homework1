package HomeworkLesson1;

public class Human implements Skills{
    private String name;
    private int runLimit;
    private int jumpLimit;
    boolean obstaclePassed;

    public Human(String name, int runLimit, int jumpLimit) {
        this.name = name;
        if(runLimit <=4000 && runLimit>0){
            this.runLimit = runLimit;
        }
        if(jumpLimit<=150 && jumpLimit>0) {
            this.jumpLimit = jumpLimit;
        }
    }

    @Override
    public void run(int distance) {
        if(runLimit>= distance){
            obstaclePassed = true;
            System.out.println("Человек " +name +" преодолел дистанцию "+distance + " см");
        }
        obstaclePassed = false;
        System.out.println("Человек " +name +" не смог преодолеть дистанцию "+distance + " см");
    }

    @Override
    public void jump(int height) {
        if (jumpLimit>=height){
            obstaclePassed = true;
            System.out.println("Человек " +name +" перепрыгнул через стену высотой "+height + " см");
        }
        obstaclePassed = false;
        System.out.println("Человек " +name +" не смог перепрыгнуть через стену высотой "+height + " см");
    }
}
