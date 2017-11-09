package mnit05;

import java.io.*
;
public class Sample9{
	public static void main(String[] args) throws IOException{
		System.out.println("整数を入力してください。");
		BufferedReader br =    new BufferedReader(new InputStreamReader(System.in));
		String str =br.readLine();
		int res =Integer.parseInt(str);
		if(100>res && res>90)
			System.out.println("優");
		else if(70<res && res<=90)
			System.out.println("良");
		else if(60<=res&& res<=70)
			System.out.println("合格");
		else
			System.out.println("不合格");
 }
	






}
