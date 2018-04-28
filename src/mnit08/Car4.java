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