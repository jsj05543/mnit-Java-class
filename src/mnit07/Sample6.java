package mnit07;

class Sample6
{
   public static void main(String[] args)
   {
      int[] test1;
      test1 = new int[3];
      test1[0] = 80;
      test1[1] = 60;
      test1[2] = 22;

      int[] test2;
      //System.out.println("test2を宣言しました。");

      test2 = test1;
      //System.out.println("test2にtest1を代入しました。");
      System.out.println("＊＊＊＊＊＊＊＊配列test1は＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊");
      for(int i=0; i<3; i++){
         System.out.print( (i+1) + "=" + test1[i]+",");
      }
      System.out.println();
      System.out.println("＊＊＊＊＊＊＊＊配列test2は(配列test1から代入)＊＊＊＊＊＊＊＊＊");
      for(int i=0; i<3; i++){
    	     System.out.print( (i+1) + "=" + test2[i]+",");
      }
      System.out.println();
      test1[2] = 100;
      System.out.println("＊＊＊＊＊＊＊＊配列test1(変更後)＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊");
      for(int i=0; i< test1.length; i++){
    	     System.out.print( (i+1) + "=" + test1[i]+",");
      }
      System.out.println();
      System.out.println("＊＊＊＊＊＊＊＊配列test2は(test1を変更後)＊＊＊＊＊＊＊＊＊＊＊");
      for(int i=0; i< test2.length; i++){
    	     System.out.print( (i+1) + "=" + test2[i]+",");
      }
      System.out.println();
      System.out.println("結果：配列を代入時代入元が変わったら代入先も変わる");
   }
}
