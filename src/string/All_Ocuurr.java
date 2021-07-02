package string;

import java.util.Scanner;

public class All_Ocuurr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			String s=sc.next();
			char c=sc.next().charAt(0);
			String ss=allOcurr(s,c);
			System.out.println(ss);
		}
	}

	private static String allOcurr(String s,char c) {
		// TODO Auto-generated method stub
		StringBuilder ss=new StringBuilder(s);
		for(int i=0;i<ss.length();i++) {
			if(ss.charAt(i)==c) {
				ss.setCharAt(i,'\0');
			}
		}
		StringBuilder s1=new StringBuilder();
		int j=0;
		for(int i=0;i<ss.length();i++) {
			if(ss.charAt(i)!='\0') {
				s1.insert(j, ss.charAt(i));
				j++;
			}
		}
		return String.valueOf(s1);
	}

}
