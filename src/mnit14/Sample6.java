import java.io.*;

class Sample6
{
   public static void main(String[] args) throws IOException
   {
      System.out.println("���������͂��Ă��������B");

      BufferedReader br =
       new BufferedReader(new InputStreamReader(System.in));

      String str = br.readLine();
      System.out.println(str + "�����͂���܂����B");
   }
}
