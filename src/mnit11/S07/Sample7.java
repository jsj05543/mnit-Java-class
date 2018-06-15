package mnit11.S07;
class Sample7
{
   public static void main(String[] args)
   {
      Car7 car1;
      car1= new Car7();
      Class cl = car1.getClass();
      car1.setCar(1234, 20.5);
      //car1.show();
      System.out.println(cl);
   }
}
