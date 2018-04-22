package mnit07;

class Sample3
{
   public static void main(String[] args)
   {
	   int s[][]=new  int[10][10];
	   for(int i=1;i<s.length+1;i++){
		   for(int j=1;j<i+1;j++) {
			   s[i][j]=i*j;
			   System.out.print(s[i][j]+" ");
			   if(i==j) {System.out.println();}
		   }
	   }
   }
}
