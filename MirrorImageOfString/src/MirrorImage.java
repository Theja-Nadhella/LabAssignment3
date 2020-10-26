//Author: Theja N
//Date:26-10-2020
//Desc: Mirror Image of a String

import java.util.Scanner;
public class MirrorImage {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String img=getImage(s);
	}
	public static String getImage(String img) {
		int n=img.length();
		for(int i=0;i<n;i++) {
			System.out.println(img.charAt(i));
		}
		System.out.println("||");
		for(int i=n;i>0;i--) {
			System.out.println(img.charAt(i));
		}
		return img;	
	}
}
