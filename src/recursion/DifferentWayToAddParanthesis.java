package recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DifferentWayToAddParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			String s=sc.next();
			List<String> ll=new ArrayList();
			ll=AddParanthesis(s);
			System.out.println(ll);
		}

	}

	private static List<String> AddParanthesis(String s) {
		// TODO Auto-generated method stub
		for(int i=0;i<s.length();i++) {
			
		}
		List<String> ll=new ArrayList();
		AddParanthesis(s,s,ll);
		return ll;
	}

	private static void AddParanthesis(String s, String ans, List<String> ll) {
		// TODO Auto-generated method stub
		
		if(ans.length()==1) {
			ll.add(s);
			System.out.println(ll);
			return;
		}
		
		for(int i=0;i<s.length()-2;i=i+2) {
			String ss=s.substring(i, i+3);
			System.out.println(ss +" "+ans);
			int add=addString(ss);
			System.out.println(add);
			AddParanthesis(s.substring(0,i)+add+s.substring(i+3),s.substring(0,i)+"x"+s.substring(i+3),ll);
			System.out.println("after return: "+ans);
			System.out.println("after return: "+s);
		}
		
	}

	private static int addString(String ss) {
		// TODO Auto-generated method stub
		int a=0;
		int b=0;
		String s="";
		String s1="";
		for(int i=0;i<ss.length();i++) {
			if(ss.charAt(i)=='*' ||ss.charAt(i)=='-' ||ss.charAt(i)=='+' ||ss.charAt(i)=='/'  ) {
				a=Integer.parseInt(s);
				s="";
				s1+=ss.charAt(i);
			}
			else {
				s+=ss.charAt(i);
			}
		}
		b=Integer.parseInt(s);
		if(s1.equals("*")) {
			return a*b;
		}
		else if(s1.equals("-")) {
			return a-b;
		}
		else if(s1.equals("+")) {
			return a+b;
		}
		else if(s1.equals("/")) {
			return a/b;
		}
		
		return b;
	}

}
