//Author: Theja N
//Date:26-10-2020
//Desc: Displaying all integers and their Sum

import java.util.Scanner;
import java.util.StringTokenizer;
public class StringTokenizerA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int sum=0;
    String str=sc.nextLine();
    StringTokenizer st=new StringTokenizer(str);
    while(st.hasMoreTokens()) {
    	String nxt=st.nextToken();
    	n=Integer.parseInt(nxt);
    	sum=sum+n;
    }
    System.out.println(sum + "is the sum of integers");
	}

}
