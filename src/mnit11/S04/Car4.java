package mnit11.S04;
//車クラス
class Car4
{
   protected int num;
   protected double gas;

   public Car4()
   {
      num = 0;
      gas = 0.0;
      System.out.println("車を作成しました。");
   }
   public void setCar(int n, double g)
   {
      num = n;
      gas = g;
      System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました。");
   }
   public void show()
   {
      System.out.println("私はスーパークラスのshowです*****"+"車のナンバーは" + num + "です。");
      System.out.println("私はスーパークラスのshowです*****"+"ガソリン量は" + gas + "です。");
   }
}