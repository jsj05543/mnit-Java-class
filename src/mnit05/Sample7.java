package mnit05;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Sample7
{
   public static void main(String[] args) throws IOException
   {
      System.out.println("整数入力してください");

      BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

      String str1 = br.readLine();
      int res1 = Integer.parseInt(str1);
      if(res1%2==0){
    	  System.out.println(res1%2);
         System.out.println("偶数");
      }
    else{
    	 System.out.println(res1%2);
         System.out.println("奇数");
      }
   }
}
