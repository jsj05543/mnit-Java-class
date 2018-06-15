package mnit10;


//車クラス
class Car8
{
   private int num;
   private double gas;
   private String name;

   public  Car8(int n, double g)
   {
      num = n;
      gas = g;
      System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました。");
   }
   public  Car8(String nm)
   {
      name = nm;
      System.out.println("名前を" + name + "にしました。");
   }
   public void show()
   {
      System.out.println("車のナンバーは" + num + "です。"+"ガソリン量は" + gas + "です。");
   }
}