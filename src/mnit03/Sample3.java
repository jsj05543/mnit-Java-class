package mnit03;
class Sample3
{
   public static void main(String[] args)
   {
      int num1=3, num2=4;




      System.out.println("変数num1の値は" + num1 + "です。"+num2);

      num2 = num1;
      num1=6;
      System.out.println("変数num1の値を変数num2に代入しました。"+num1);
      System.out.println("変数num2の値は" + num2 + "です。");
   }
}
