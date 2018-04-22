package mnit11.S06;
class Sample6
{
   public static void main(String[] args)
   {
      Car6 cars[];
      cars = new Car6[2];

      cars[0] = new Car6();
      cars[0].setCar(1234, 20.5);

      cars[1] = new RacingCar6();
      cars[1].setCar(4567, 30.5);

      for(int i=0; i<cars.length; i++){
         cars[i].show();
      }
   }
}
