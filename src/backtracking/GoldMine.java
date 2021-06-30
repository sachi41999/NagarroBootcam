package backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoldMine {
	static int max=Integer.MIN_VALUE;
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			max=Integer.MIN_VALUE;
			int n=sc.nextInt();
			int m=sc.nextInt();
			int arr[][]=new int[n][m];
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					arr[i][j]=sc.nextInt();
				}
			}
			
			int maxi=goldPath(arr);
			System.out.println(maxi);
			
			
		}

	}

	private static int goldPath(int[][] grid) {
		// TODO Auto-generated method stub
		int arr[][]=grid;
		int count=0;
		List<Integer> ll=new ArrayList();
		int row=0;
		int col=0;
		
		boolean visit[][]=new boolean[arr.length][arr[0].length];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j]!=0) {
					goldPath(arr,visit,i,j,count,ll);
				}
			}
		}
		
		return max;
	}

	private static void goldPath(int[][] arr,boolean visit[][],int row,int col, int count, List<Integer> ll) {
		
		if(col<0 || row<0 || col>=arr[0].length || row>=arr.length ||arr[row][col]==0 || visit[row][col]==true ) {
			return;
		}
		
		count=count+arr[row][col];
		if(count>max) {
			
			max=count;
		}
	
			visit[row][col]=true;
			
			goldPath(arr,visit,row,col-1,count,ll);
			goldPath(arr,visit,row,col+1,count,ll);
			goldPath(arr,visit,row-1,col,count,ll);
			goldPath(arr,visit,row+1,col,count,ll);
			visit[row][col]=false;
		
	}

}
