package mnit12.S02;
//のりものクラス
abstract class Vehicle
{
	protected int speed;
	public void setSpeed(int s)
	{
		speed = s;
		System.out.println("速度を" + speed + "にしました。");
	}
	abstract void show();
}