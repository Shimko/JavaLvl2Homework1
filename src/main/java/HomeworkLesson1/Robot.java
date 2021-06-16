package HomeworkLesson1;

public class Robot implements Skills{
   private String name;
   private int runLimit;
   private int jumpLimit;
   private boolean  performance;


   public Robot(String name, int runLimit, int jumpLimit) {
      this.name = name;
      this.runLimit = runLimit;
      this.jumpLimit = jumpLimit;

   }

   @Override
   public boolean winObstacle() {
      return performance;
   }

   @Override
   public void run(int distance) {
      if(runLimit>= distance){
         performance = true;
         System.out.println("Робот "+ name + " удачно пробежал " +distance);
      }
      performance = false;
      System.out.println("Робот "+ name + "не смог пробежать  " +distance);
   }

   @Override
   public void jump(int height) {
      if (jumpLimit>=height){
         performance = true;
         System.out.println("Робот "+ name + " удачно перепрыгнул через стену высотой  " + height);
      }
      performance = false;
      System.out.println("Робот "+ name + " не смог перепрыгнуть через стену высотой  " + height);
   }
}
