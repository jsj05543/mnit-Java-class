package mnit03;
class Sample3
{
   public static void main(String[] args)
   {
      int num1=3, num2=4;
      String str1="ABC", str2="XYZ";
      System.out.println("＊＊＊＊＊＊＊＊代入前＊＊＊＊＊＊＊＊＊");
      System.out.println("num1=" + num1 + " num2="+num2);
      System.out.println("str1=" + str1 + " str2="+str2);
      System.out.println("＊＊＊＊＊＊＊＊代入後＊＊＊＊＊＊＊＊＊");
      num2 = num1;
      str2 = str1;
      System.out.println("num1=" + num1 + " num2="+num2);
      System.out.println("str1=" + str1 + " str2="+str2);
      num1=6;
      str1="MNK";
      System.out.println("＊＊＊num1とstr1の値を変更後＊＊＊＊＊");
      System.out.println("num1=" + num1 + " num2="+num2);
      System.out.println("str1=" + str1 + " str2="+str2);
      System.out.println("結果：変数を代入時代入元が変っても代入先が変わらない");
   }
}
