package mnit08;
//車クラス
class Car4
{
   int num;
   double gas;

   void setNum(int n)
   {
      num = n;
      System.out.println("ナンバーを" + num + "にしました。");
   }

   void setGas(double g)
   {
      gas = g;
      System.out.println("ガソリンを" + gas + "にしました。");
   }

   void show()
   {
      System.out.println("クラスのナンバーは" + num + "です");
      System.out.println("ガソリン量は" + gas + "です");
   }
}

class Sample4
{
   public static void main(String[] args)
   {
      Car4 car1 = new Car4();

      car1.setNum(1234);
      car1.setNum(124);
      car1.setGas(20.5);
      car1.show();
   }
}
