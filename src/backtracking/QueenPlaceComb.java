package backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QueenPlaceComb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int queens=sc.nextInt();
			int boxSize=sc.nextInt();
			List<String> ll=new ArrayList();
			queenCombo(queens,0,boxSize,ll,"",0);
			System.out.print(ll);
		}

	}

	private static void queenCombo(int queens, int prev, int boxSize, List<String> ll, String ans,int currQ) {
		// TODO Auto-generated method stub
		if(currQ==queens) {
			ll.add(ans);
			return;
		}
		
		for(int i=prev;i<boxSize;i++) {
			queenCombo(queens,i+1,boxSize,ll,ans+"q"+currQ+"b"+i,currQ+1);
		}
		
	}

}
