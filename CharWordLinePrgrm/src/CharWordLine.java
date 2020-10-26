//Author: Theja N
//Date:26-10-2020
//Desc:Number of Characters, words, lines
import java.util.Scanner;
public class CharWordLine {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int res=calculateCWL(str);
	}
   public static int calculateCWL(String res) {
	   int Words=0,Characters=0,Lines=0;
	   for(int i=0;i<res.length();i++) {
		   if(res.charAt(i)==' ') {
			   Words++;
		   }
		   if(res.charAt(i)== '\n') {
			   Lines++;
		   }Characters++;
	   }
	   System.out.println("The characters are"+ Characters);
	   System.out.println("The words are"+ Words);
	   System.out.println("The lines are"+ Lines);
	   return Lines;
   }
}
