package mnit07;

import java.io.IOException;

class Sample9
{
   public static void main(String[] args) throws IOException
   {

	   String[][] str=new String[2][3];
	   str[0][0] = "a";
	   str[0][1] = "b";
	   str[0][2] = "b";
	   str[1][0] = "d";
	   str[1][1] = "e";
	   str[1][2] = "e";
	   int i=0;
	   for(i=0;i<str.length;i++) {
		   for(int j=0;j<str[i].length;j++) {

			   System.out.println(str[i][j]);
		   }
		   System.out.println(str.length);
		   System.out.println(str[i]);
	   }




   }


}
