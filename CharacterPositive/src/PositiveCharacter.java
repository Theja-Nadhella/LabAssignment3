//Author: Theja N
//Date:26-10-2020
//Desc:Character is positive or not
import java.util.Scanner;
public class PositiveCharacter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String: ");
		String str=sc.nextLine();
		String res=checkPositive(str);
	}
	public static String checkPositive(String res) {
		for(int i=0;i<res.length();i++) {
			if(res.charAt(i+1) < res.charAt(i)) {
				System.out.println("not positive");
			}
			else
				System.out.println("positive");
		} return res;
	}
}
