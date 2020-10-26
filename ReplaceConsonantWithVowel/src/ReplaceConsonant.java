//Author: Theja N
//Date:26-10-2020
//Desc: Replacing Consonants with vowels
import java.util.Scanner;
public class ReplaceConsonant {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String strO=alterString(str);
	}
public static String alterString(String strO) {
	int len=strO.length();
	for(int i=0;i<len;i++) {
		char j=strO.charAt(i);
		if(j=='a'||j=='A' ||j=='e' ||j=='E' || j=='i'||j=='I' || j=='o'||j=='O' || j=='u' ||j=='U') {
			System.out.println(j);
		}
		else {
			char ch=strO.charAt(i);
			ch++;
			System.out.println(ch);
		}			
	} return strO;
}
}
