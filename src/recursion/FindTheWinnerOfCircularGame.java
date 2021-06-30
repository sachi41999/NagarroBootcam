package recursion;

import java.util.Scanner;

public class FindTheWinnerOfCircularGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int k=sc.nextInt();
			int player=playerWinner(n,k);
			System.out.println(player);
		}
		

	}

	private static int playerWinner(int n, int k) {
		// TODO Auto-generated method stub
		int arr[]=new int[n];
		int j=0;
		for(int i=1;i<=n;i++) {
			arr[j]=i;
			j++;
		}
		
		int player=0;
		playerWinner(k,arr,0,1);
		
		for(int a:arr) {
			if(a!=0) {
				player=a;
				break;
			}
		}
		return player;
	}

	private static int[] playerWinner(int k, int[] arr, int i, int count) {
		// TODO Auto-generated method stub
		if(i==arr.length) {
			i=i%arr.length;
		}
		
		
		if(count==k && arr[i]!=0) {
			arr[i]=0;
			i=i+1;
			count=1;
			
		}
		while(arr[i]==0) {
			if(i==arr.length) {
				i=i%arr.length;
			}
			i=i+1;
			
		}
		if(chechZero(arr)) {
			if(count<2) {
				count=count+1;
			}
			playerWinner(k,arr,i+1,count);
		}
		else {
			return arr;
		}
		return arr;
		
	}

	private static boolean chechZero(int[] arr) {
		// TODO Auto-generated method stub
		int count=0;
		for(int a:arr) {
			if(a!=0) {
				count++;
			}
		}
		if(count==1) {
			return false;
		}
		else {
			return true;
		}
		
	}

}
