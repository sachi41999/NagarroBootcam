package backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QueenPlace_1D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int tot_queen=sc.nextInt();
			int box_size=sc.nextInt();
			boolean box[]=new boolean[box_size];
			List<String> ll=new ArrayList();
			queenplace(tot_queen,box_size,box,0,"",ll);
			System.out.println(ll);
		}

	}

	private static void queenplace(int tot_queen, int box_size, boolean[] box, int currQueen,String ans,List<String> ll) {
		// TODO Auto-generated method stub
		if(currQueen==tot_queen) {
			ll.add(ans);
			return;
		}
		
		
		for(int i=0;i<box_size;i++) {
			if(box[i]==false) {
				box[i]=true;
				queenplace(tot_queen,box_size,box,currQueen+1,ans+"q"+currQueen+"->b"+i+",",ll);
				box[i]=false;
			}
		}
		
	}

}
