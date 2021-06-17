package HomeworkLesson1;

public class Robot implements Skills{
   private String type;
   private String name;
   private int runLimit;
   private int jumpLimit;
   private boolean  winObstacle;


   public Robot(String type,String name, int runLimit, int jumpLimit) {
      this.type = type;
      this.name = name;
      this.runLimit = runLimit;
      this.jumpLimit = jumpLimit;


   }



   @Override
   public void run(int distance) {
      if(runLimit>= distance){
         winObstacle = true;
         System.out.println("Робот "+ name + " удачно пробежал " +distance);
      }
      System.out.println("Робот "+ name + "не смог пробежать  " +distance);
   }

   @Override
   public void jump(int height) {
      if (jumpLimit>=height){
         winObstacle = true;
         System.out.println("Робот "+ name + " удачно перепрыгнул через стену высотой  " + height);
      }
      System.out.println("Робот "+ name + " не смог перепрыгнуть через стену высотой  " + height);
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
