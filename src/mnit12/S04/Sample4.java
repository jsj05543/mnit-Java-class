package mnit12.S04;
//�̂���̃C���^�[�t�F�C�X
interface iVehicle
{
   void vShow();
}
//�ޗ��C���^�[�t�F�[�X
interface iMaterial
{
   void mShow();
}
//�ԃN���X
class Car implements iVehicle,iMaterial
{
   private int num;
   private double gas;
   
   public Car(int n, double g)
   {
      num = n;
      gas = g;
      System.out.println("�i���o�[" + num + "�K�\������" + gas+ "�̎Ԃ��쐬���܂����B");
   }
   public void vShow()
   {
      System.out.println("�Ԃ̃i���o�[��" + num + "�ł��B");
      System.out.println("�K�\�����ʂ�" + gas + "�ł��B");
   }
   public void mShow()
   {
      System.out.println("�Ԃ̍ގ��͓S�ł��B");
   }
}

class Sample4
{
   public static void main(String[] args)
   {
      Car car1 = new Car(1234, 20.5);
      car1.vShow();
      car1.mShow();
   }
}
