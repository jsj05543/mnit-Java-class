package mnit05;
import java.io.*;

class Sample5
{
   public static void main(String[] args) throws IOException
   {
      System.out.println("1,2,3,4のどちらが入力してください。");

      BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

      String str = br.readLine();
      int res = Integer.parseInt(str);
      //nt A;
	//String B,C,D;

      switch(res){
         case 1:
            System.out.println("優です。");
            break;
         case 2:
            System.out.println("良です。");
            break;
         case 3:
             System.out.println("合格です。");
             break;
         case 4:
             System.out.println("不合格です。");
             break;
         default:
            System.out.println("1,2,3,4のどちらが入力してください。");
            break;
       }
   }
}
