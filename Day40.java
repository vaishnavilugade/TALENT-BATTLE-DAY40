import java.util.*;
class Day40{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String a,sub,newstr;
		System.out.println("Enter string:");
		a=sc.nextLine();
		System.out.println("Enter substring to be remove:");
		sub=sc.nextLine();
		System.out.println("Enter new substring to be add:");
		newstr=sc.nextLine();
		a= a.replaceAll(sub, newstr);
		System.out.println("\nNEW STRING WILL BE: "+a);
	}
}

