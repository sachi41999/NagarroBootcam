package backtracking;

import java.util.*;

public class N_Knights {
	static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		count=0;
		int n=sc.nextInt();
		sc.close();
		boolean visit[][]=new boolean[n][n];
		int row=0;
		int col=0;
		int tot=0;
		Knights(tot,n,row,col,visit,"");
		System.out.println();
		System.out.println(count);
	}
	private static void Knights(int tot,int n, int row, int col, boolean[][] visit, String ans) {
		// TODO Auto-generated method stub
		if(tot==n) {
			count++;
			System.out.print(ans+"  ");
			return;
		}
		
		if(col>=n) {
			row=row+1;
			col=0;
		}
		
		if(row>=n) {
			return;
		}
		
		//System.out.println(ans);
		//System.out.println(row+" "+col);
		if(checkKnight(n,visit,row,col)) {
		//System.out.println("hurre");	
		visit[row][col]=true;	
		Knights(tot+1,n,row,col+1,visit,ans+"{"+row+"-"+col+"} ");
		visit[row][col]=false;
		}
		Knights(tot,n,row,col+1,visit,ans);
	}
	private static boolean checkKnight(int n,boolean[][] visit, int row, int col) {
		// TODO Auto-generated method stub
	//	System.out.println(row +" "+col);
		//it is for right(up and down)
		int row1=row+1;
		int col1=col+2;
		if(row1<n && col1<n && visit[row1][col1]==true) {
			return false;
		}
		row1=row-1;
		col1=col1+2;
		if(row1>=0 && col1<n && visit[row1][col1]==true) {
			return false;
		}
		
		//it is for up (left and right)
		
		row1=row-2;
		col1=col+1;
		if(row1>=0 && col1<n && visit[row1][col1]==true) {
			return false;
		}
		
		row1=row-2;
		col1=col-1;
		if(row1>=0 && col1>=0 && visit[row1][col1]==true) {
			return false;
		}
		
		//it is for left up and down
		row1=row+1;
		col1=col-2;
		if(row1<n && col1>=0 && visit[row1][col1]==true) {
			return false;
		}
		
		row1=row-1;
		col1=col-2;
		if(row1>=0 && col1>=0 && visit[row1][col1]==true) {
			return false;
		}
		
		//it is for down(left and right)
		
		row1=row+2;
		col1=col-1;
		if(row1<n && col1>=0 && visit[row1][col1]==true) {
			return false;
		}
		
		row1=row+2;
		col1=col+1;
		if(row1<n && col1<n && visit[row1][col1]==true) {
			return false;
		}
		
		
		return true;
	}

}
