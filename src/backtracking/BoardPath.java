package backtracking;

import java.util.*;

public class BoardPath {
static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		count=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int arr[]=new int[m];
		for(int i=0;i<m;i++) {
			arr[i]=i+1;
		}
		sc.close();
		validBoardPath(n,m,"",arr);
		System.out.println();
		System.out.println(count);
	}
	private static void validBoardPath(int n, int m, String string, int[] arr) {
		// TODO Auto-generated method stub
		if(n==0) {
			count++;
			System.out.print(string+" ");
			return;
			
		}
		
		if(n<0) {
			return;
		}
		for(int i=0;i<arr.length;i++) {
			validBoardPath(n-arr[i],m,string+arr[i],arr);
		}
		
	}

}
