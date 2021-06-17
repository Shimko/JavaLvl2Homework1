package HomeworkLesson1;

public class Human implements Skills{
    private String name;
    private int runLimit;
    private int jumpLimit;
    private boolean performance;


    public Human(String name, int runLimit, int jumpLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
        this.performance = true;
    }

    @Override
    public boolean winObstacle() {
        return performance;
    }

    @Override
    public void run(int distance) {
        if (runLimit >= distance) {
            System.out.println("Человек "+ name + " удачно пробежал " +distance);
        }
        performance = false;
        System.out.println("Человек "+ name + "  не смог пробежать " +distance);

    }

    @Override
    public void jump(int height) {
        if (jumpLimit>=height){
            System.out.println("Человек "+ name + " удачно перепрыгнул через стену высотой  " +height);
        }
        performance = false;
        System.out.println("Человек "+ name + " не смог перепрыгнуть через стену высотой  " +height);
    }
}
