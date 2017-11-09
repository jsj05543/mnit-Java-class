package mnit08;
//車クラス
class Car2
{
   int num;
   double gas;

   void show()
   {
      System.out.println("クラスのナンバーは" + num + "です");
      System.out.println("ガソリン量は" + gas + "です");
   }
}

class Sample2
{
   public static void main(String[] args)
   {
      Car2 car1;
      car1 = new Car2();

      car1.num = 1234;
      car1.gas = 20.5;
      car1.show();
   }
}
