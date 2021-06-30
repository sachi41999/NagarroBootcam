package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LongestLengthOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			List<String> arr=new ArrayList();
			int n=sc.nextInt();
			for(int i=0;i<n;i++) {
				arr.add(sc.next());
			}
			int max=longestString(arr);
			System.out.println(max);
		}

	}

	private static int longestString(List<String> arr) {
		// TODO Auto-generated method stub
		List<String> ll=new ArrayList();
		longestString(arr,0,"",ll);
		int max=0;
		for(String a:ll) {
			int len=a.length();
			if(len>max) {
				max=len;
			}
		}
		return max;
	}

	private static void longestString(List<String> arr, int i, String ans, List<String> ll) {
		// TODO Auto-generated method stub
		if(i==arr.size()) {
			ll.add(ans);
			return;
		}
		
		if(checkString(ans,arr.get(i))) {
			String s=arr.get(i);
			longestString(arr,i+1,ans+s,ll);
			longestString(arr,i+1,ans,ll);
		}
		else {
			longestString(arr,i+1,ans,ll);
		}
		
		
	}

	private static boolean checkString(String ans, String string) {
		char c[]=string.toCharArray();
		Arrays.sort(c);
		for(int i=0;i<c.length-1;i++) {
			if(c[i]==c[i+1]) {
				return false;
			}
		}
		// TODO Auto-generated method stub
		StringBuilder ss=new StringBuilder(ans);
		for(int i=0;i<string.length();i++) {
			if(ans.contains(""+string.charAt(i))) {
				return false;
			}
		}
		return true;
	}

}
