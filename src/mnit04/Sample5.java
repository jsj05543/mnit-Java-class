package mnit04;
class Sample5
{
   public static void main(String[] args)
   {
      int a = 0;
      int b = 0;
      int c = 0;
      int d = 0;

      b = a++;
      c = ++d;

      System.out.println("代入後にインクリメントしたのでbの値は" + b + "です。");
      System.out.println("代入前にインクリメントしたのでbの値は" + c + "です。");
   }
}
