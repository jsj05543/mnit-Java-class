package mnit10;
import java.awt.Point;
//車クラス
class Sample8
{
   public static void main(String[] args)
   {
	   //基本型は値渡し
	   int a = 10;
	   System.out.println("****************aの値は***************** ");
	   System.out.println("a=" + a);
	   // メソッドを呼び出す
	   Sample8.changeCar1(a);
	   System.out.println("****************aの値は***************** ");
	   System.out.println("a=" + a);
	   System.out.println("*************************************** ");
	   //参照型は参照渡し
	   Point p = new Point(100, 200);
	   System.out.println("p の参照先インスタンスの内容は " + p);
	   // メソッドを呼び出す
	   Sample8.changeCar2(p);
	   System.out.println("p の参照先インスタンスの内容は " + p);
   }
   public static void changeCar1(int b)
   {
	   System.out.println("****************bの値は***************** ");
	   System.out.println("b=" + b);
	    // 値を変更する
		b = 30;
		System.out.println("****************bの値は(変更後)********** ");
		System.out.println("b=" + b);
   }
   public static void changeCar2(Point car2)
   {
	   System.out.println("q の参照先インスタンスの内容は " + car2);
	   car2.x = 300;
	   car2.y = 400;
		System.out.println("q の参照先インスタンスの内容は " + car2);
   }
}
