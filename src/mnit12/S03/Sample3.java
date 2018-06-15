package mnit12.S03;
class Sample3
{
 public static void main(String[] args)
 {
    iVehicle[] ivc;
    ivc = new iVehicle[2];

    ivc[0] = new Car(1234, 20.5);

    ivc[1] = new Plane(232);

    for(int i=0; i<ivc.length; i++){
      ivc[i].show();
    }
 }
}
