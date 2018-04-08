package mnit05;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Sample6
{
   public static void main(String[] args) throws IOException
   {
      System.out.println("A,B,C,D,のどちらが入力してください。");

      BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

      String str = br.readLine();


      //char res = str.charAt(0);

      switch(str){
         case "AA":
            System.out.println("優です。");
            break;
         case "BB":
            System.out.println("良です。");
            break;
         case "CC":
             System.out.println("合格です。");
             break;
         case "DD":
             System.out.println("不合格です。");
             break;
         default:
            System.out.println("A,B,C,D,のどちらが入力してください。");
            break;
      }
   }
}
