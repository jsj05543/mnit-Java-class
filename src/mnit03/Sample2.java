package mnit03;
class Sample2
{
   public static void main(String[] args)
   {
	   String str1="ABC", str2="XYZ";
	      System.out.println("＊＊＊＊＊＊＊＊代入前＊＊＊＊＊＊＊＊＊");
	      System.out.println("str1=" + str1 + " str2="+str2);
	      System.out.println("＊＊＊＊str1をstr2に代入後＊＊＊＊＊＊");
	      str2 = str1;
	      System.out.println("str1=" + str1 + " str2="+str2);
	      str1="MNK";
	      System.out.println("＊＊＊＊str1の値を変更後＊＊＊＊＊＊＊");
	      System.out.println("str1=" + str1 + " str2="+str2);
	      System.out.println("結果：str1を変更してもstr2は変わらない");
   }
}
