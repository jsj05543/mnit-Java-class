package mnit11.S06;
//レーシングカークラス
class RacingCar6 extends Car6
{
   private int course;

   public RacingCar6()
   {
      course = 0;
      System.out.println("レーシングカーを作成しました。");
   }
   public void setCourse(int c)
   {
      course = c;
      System.out.println("コース番号を" + course + "にしました。");
   }
   public void show()
   {
      System.out.println("レーシングカーのナンバーは" + num + "です。");
      System.out.println("ガソリン量は" + gas + "です。");
      System.out.println("コース番号は" + course + "です。");
   }
}