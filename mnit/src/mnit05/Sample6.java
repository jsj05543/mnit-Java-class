package mnit05;
import java.io.*;

class Sample6
{
   public static void main(String[] args) throws IOException
   {
      System.out.println("A,B,C,D,のどちらが入力してください。");

      BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

      String str = br.readLine();
      
      String b;
      
     b= "sddddddda";
   
      char res = str.charAt(0);

      switch(res){
         case 'A':
            System.out.println("優です。");
            break;
         case 'B':
            System.out.println("良です。");
            break;
         case 'C':
             System.out.println("合格です。");
             break;
         case 'D':
             System.out.println("不合格です。");
             break;
         default:
            System.out.println("A,B,C,D,のどちらが入力してください。");
            break;
      }
   }
}
