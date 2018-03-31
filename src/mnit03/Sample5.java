package mnit03;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Sample5
{
   public static void main(String[] args) throws IOException
   {
      System.out.println("整数を入力してください。");
      BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));
      String str = br.readLine();
      int num = Integer.parseInt(str);
      int num1=2+num;
      System.out.println(num1 + "が入力されました。");
   }
}
