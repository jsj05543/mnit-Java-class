package mnit08;
//車クラス
class Car4
{
   int num;
   double gas;
   String name;

   void setNum(int n)
   {
      this.num = n;
      System.out.println("ナンバーを" + num + "にしました。");
   }
   void setGas(double g)
   {
      this.gas = g;
      System.out.println("ガソリンを" + gas + "にしました。");
   }

   void setName(String nm)
   {
	   this.name=nm;
   }


   void show()
   {
	   if(name.equals("TOYOTA"))
			   {
		   System.out.println("クラスのナンバーは" + num + "です");
		   System.out.println("ガソリン量は" + gas + "です");
			   }
	   else {
		   System.out.println("aaaaaaaa");

	   }

   }
}