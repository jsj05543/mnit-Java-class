package mnit08;

class Sample1
{
   public static void main(String[] args)
   {

	   Car1 car1 = new Car1();
	   car1.num=1234;
	   car1.gas=20.5;
	   car1.name="ABC";
	   System.out.println("＊＊＊＊＊＊＊＊car1オブジェクトのメンバーは＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊");
	   System.out.println("num="+car1.num+", gas="+car1.gas+", name="+car1.name);
	   System.out.println("＊＊＊＊＊＊＊＊car2オブジェクトのメンバーは(car1から代入)＊＊＊＊＊＊＊＊＊＊＊");
	   Car1 car2 = new Car1();
	   car2=car1;
	   System.out.println("num="+car2.num+", gas="+car2.gas+", name="+car2.name);
	   car1.num=6789;
	   car1.name="XYZ";
	   System.out.println("＊＊＊＊＊＊＊＊car1オブジェクトのメンバーは(変更後)＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊");
	   System.out.println("num="+car1.num+", gas="+car1.gas+", name="+car1.name);
	   System.out.println("＊＊＊＊＊＊＊＊car2オブジェクトのメンバーは(car1変更後)＊＊＊＊＊＊＊＊＊＊＊＊＊");
	   System.out.println("num="+car2.num+", gas="+car2.gas+", name="+car2.name);
	   System.out.println("car1とcar2異なる二つのオブジェクトではなく、同じひとつのオブジェクトを指している＊");





   }
}
