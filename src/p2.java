import java.util.Scanner;

public class p2 {

	public static void main(String args[])
	{
//		byte c=127;
//		short a=45;
//		long l=13132;
//		int sum=0;
//		sum=(int) (c+a+l);
//		System.out.println(sum);
		
		String s1=new String("abcdef");
		String s2="abcdef";
		
		System.out.println(s2.charAt(2));
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.indexOf("f"));
		System.out.println(s2.substring(0,4));
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Enter the string");
//		String s=scan.nextLine();
//		scan.nextLine();
//		System.out.println(s);
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		s1=s1.intern();
		System.out.println(s1==s2);
	}
}
