package string;

import java.util.Scanner;

public class Love_Letter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			sc.nextLine();
			String s=sc.nextLine();
			int k=sc.nextInt();
			System.out.println(letter_love(s,k));
		}

	}

	private static int letter_love(String s, int k) {
		// TODO Auto-generated method stub
		int count=0;
		String st[]=s.split(" ");
		for(int i=0;i<st.length;i++) {
			StringBuilder s1=new StringBuilder(st[i]);
			for(int j=0;j<k;j++) {
				revrse(s1,0,s1.length()-k);
				revrse(s1,s1.length()-k,s1.length());
				revrse(s1,0,s1.length());
			}
			if(isequal(s1,st[i])) {
				count++;
			}
		}
		return count;
	}

	private static boolean isequal(StringBuilder s1, String string) {
		// TODO Auto-generated method stub
		String ss=String.valueOf(s1);
		if(string.equals(ss)) {
			return true;
		}
		return false;
	}

	private static void revrse(StringBuilder s1, int start, int end) {
		// TODO Auto-generated method stub
		int i=start;
		int j=end-1;
		
		while(i<j) {
			char c=s1.charAt(i);
			s1.setCharAt(i, s1.charAt(j));
			s1.setCharAt(j,c);
			i++;
			j--;
		}
		
	}

}
