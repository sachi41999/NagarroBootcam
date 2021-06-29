package backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QueenPlace_2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int queen=sc.nextInt();
			int row=sc.nextInt();
			int col=sc.nextInt();
			List<String> ll=new ArrayList();
			int r=0;
			int c=0;
			queenCombo(queen,row,col,r,c,ll,0,"");
			System.out.println(ll);
		}
	}

	private static void queenCombo(int queen, int row, int col, int r, int c, List<String> ll, int cQ, String ans) {
		// TODO Auto-generated method stub
		if(cQ==queen) {
			ll.add(ans);
			return;
		}
		
		
		
		if(c==col) {
			r=r+1;
			c=0;
		}
		
		if(r>=row) {
			return;
		}
		queenCombo(queen,row,col,r,c+1,ll,cQ+1,ans+"q"+cQ+"{"+r+","+c+"}");
		queenCombo(queen,row,col,r,c+1,ll,cQ,ans);
	}

}
