package mnit12.S03;
//�̂���̃C���^�[�t�F�[�X
interface iVehicle
{
   void show();
}
//�ԃN���X
class Car implements iVehicle
{
   private int num;
   private double gas;
   
   public Car(int n, double g)
   {
      num = n;
      gas = g;
      System.out.println("�i���o�[" + num + "�K�\������" + gas+ "�̎Ԃ��쐬���܂����B");
   }
   public void show()
   {
      System.out.println("�Ԃ̃i���o�[��" + num + "�ł��B");
      System.out.println("�K�\�����ʂ�" + gas + "�ł��B");
   }
}
//��s�@�N���X
class Plane implements iVehicle
{
   private int flight;

   public Plane(int f)
   {
      flight = f;
      System.out.println("��" + flight + "�̔�s�@���쐬���܂����B");
   }

   public void show()
   {
      System.out.println("��s�@�̕ւ�" + flight + "�ł��B");
   }
}

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
