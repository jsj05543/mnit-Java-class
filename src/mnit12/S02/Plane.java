package mnit12.S02;
//飛行機クラス
public class Plane extends Vehicle
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
		System.out.println("速度は" + speed + "です。");
	}
}