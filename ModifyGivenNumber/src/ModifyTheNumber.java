//Author: Theja N
//Date:26-10-2020
//Desc:Modify number(Difference b/n two consecutive digits)

import java.util.Scanner;
public class ModifyTheNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int res=modifyNumber(num);
	}
   public static int modifyNumber(int res) {
	   int rev=0;
	   int n=res%10;
	   while(res!=0) {
		   int rem=res%10;
		   rev=rev*10+rem;
		   res=res/10;
	   } System.out.println(rev);
	   while(rev!=0) {
		   int a=rev%10;
		   rev=rev/10;
		   int b=rev%10;
		   int result=a-1;
		   System.out.println(result);
	   }return res;
   }

}
