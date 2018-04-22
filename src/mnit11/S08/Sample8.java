package mnit11.S08;
class Sample8
{
   public static void main(String[] args)
   {
      Car8 car1 = new Car8();
      Car8 car2 = new Car8();

      Car8 car3;
      car3 = car1;

      boolean bl1 = car1.equals(car2);
      boolean bl2 = car1.equals(car3);

      System.out.println("car1とcar2が同じか調べたところ" + bl1 + "でした。");
      System.out.println("car1とcar3が同じか調べたところ" + bl2 + "でした。");
   }
}
