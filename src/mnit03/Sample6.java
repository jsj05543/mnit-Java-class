package mnit03;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Sample6
{
   public static void main(String[] args) throws IOException
   {
      System.out.println("整数を2つ入力してください。");

      BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

      String str1 = br.readLine();
      String str2 = br.readLine();
      String str3 = br.readLine();

      int num1 = Integer.parseInt(str1);
      int num2 = Integer.parseInt(str2);
      int num3 = Integer.parseInt(str3);

      System.out.println("最初に" + num1 + "が入力されました。");
      System.out.println("次に" + num2 + "が入力されました。");
      System.out.println("次に" + num3 + "が入力されました。");

   }
}
