package mnit06;

class Sample6
{
   public static void main(String[] args)
   {
	   Double a1=new Double(2);
	   Integer a=new Integer(1);
	   int a2=0;
	   Integer b=new Integer(1);
	   if(b instanceof Integer)
		   System.out.println(1111);
	   if(a1 instanceof Double)
		   System.out.println(2222);

      int i = 8;

      do{
         System.out.println(i + "番目の繰り返しています。");
         i++;
      }while(i <7);

      System.out.println("繰り返しが終わりました。");
   }
}
