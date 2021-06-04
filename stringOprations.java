/*
 W.a.p to design a string class that perform string method 
 (equals, reverse the string, change case, trim)
*/
import java.io.*;

public class stringOprations{
	public static void main(String[] args) throws Exception{
		BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
		String s,s1;
		boolean check=true;
		System.out.println("enter string 1 :");
		s = str.readLine();

		System.out.println("enter string 2 :");
		s1 = str.readLine();

		System.out.println("---reverse()---");
	/*	String r,r1;
		r = s;
		r1 = s1;*/
		StringBuffer r = new StringBuffer(s);
		StringBuffer r1 = new StringBuffer(s1);
		r.reverse();
		r1.reverse();
		System.out.println("string 1 :" + r);
		System.out.println("string 2 :" + r1);
		System.out.println("--------------");

		System.out.println("---equals()---");
		check = s.equals(s1);
		if(check==true){
			System.out.println("both string are equals.");
		}
		else{
			System.out.println("both string are not equals.");
		}
		System.out.println("---------------");

		System.out.println("---trim()---");
		String tr,t;
		tr = s.trim();
		t = s1.trim();
		System.out.println("string 1 :" + tr);
		System.out.println("string 2 :" + t);
		System.out.println("--------------");

		/*System.out.println("---reverse()---");
		String r,r1;
		/*r = s.reverse();
		r1 = s1.reverse();*/
		/*System.out.println("string 1 :" + s.reverse());
		System.out.println("string 2 :" + s1.reverse);
		System.out.println("--------------");*/

		System.out.println("---changeCase()---");
		
		
		String upper = s.toUpperCase();
		String lower = s1.toLowerCase();
		System.out.println("Uppercase: " + upper);
		System.out.println("Lowercase: " + lower);

		System.out.println("--------------");
		
	}
}