package mnit12.S03;
//飛行機クラス
class Plane implements iVehicle
{
 private int flight;

 public Plane(int f)
 {
    flight = f;
    System.out.println("便" + flight + "の飛行機を作成しました。");
 }

 public void show()
 {
    System.out.println("飛行機の便は" + flight + "です。");
 }
}