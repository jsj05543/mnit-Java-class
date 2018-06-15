package mnit12.S01;
class Sample1
{
   public static void main(String[] args)
   {
      Vehicle[] vc;
      vc = new Vehicle[2];

      vc[0] = new Car(1234, 20.5);
      vc[0].setSpeed(60);

      vc[1] = new Plane(232);
      vc[1].setSpeed(500);

      for(int i=0; i<vc.length; i++){
        vc[i].show();
      }
   }
}