public class MathMethods{
   public static void main(String[]args){

      //1. Math sqrt()
      double sqrtValue = Math.sqrt(36);
      System.out.println("Math.sqrt(36) : " +sqrtValue);

      //2.Math pow()
      double powValue = Math.pow(5,2);
      System.out.println("Math.pow(5,2) : " +powValue);

      //3.Math.ceil()
      double ceilValue = Math.ceil(75.73);
      System.out.println("Math.ceil(75.73) : " +ceilValue);

      //4.Math floor()
      double floorValue = Math.floor(32.69);
      System.out.println("Math.floor(32.69) : " +floorValue);

      //5.Math max()
      int maxValue = Math.max(9,5);
      System.out.println("Math.max(9,5) : " +maxValue);

      //6.Math min()
      int minValue = Math.min(9,5);
      System.out.println("Math.min(9,5) : " +minValue);

      //7.Math round()
      double roundValue = Math.round(9.85);
      System.out.println("Math.round(9.85) : " +roundValue);

      //8.Math nextUp()
      double nextUpValue = Math.nextUp(6.5);
      System.out.println("Math.nextUp(6.5) : " +nextUpValue);

      //9.Math nextDown()
      double nextDownValue = Math.nextDown(6.5);
      System.out.println("Math.nextDown(6.5) : " +nextDownValue);

      //10.Math random()
      double randomValue = Math.random();
      System.out.println("Math.random() : " +randomValue);
  }
}