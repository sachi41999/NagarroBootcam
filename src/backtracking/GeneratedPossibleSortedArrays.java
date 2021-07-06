package backtracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class GeneratedPossibleSortedArrays {

	 public static void main(String args[]) {
         Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int m=sc.nextInt();
			int A[]=new int[n];
			int B[]=new int[m];
			for(int i=0;i<n;i++) {
				A[i]=sc.nextInt();
			}
			for(int i=0;i<m;i++) {
				B[i]=sc.nextInt();
			}
			int i=0;
			int j=0;
			List<List<Integer>> ll=new ArrayList();
			List<Integer> temp=new ArrayList();
			mersortedArray(A,B,i,j,false,ll,temp);
			for( List<Integer> sol:ll) {
				for(int sol1:sol) {
					System.out.print(sol1+" ");
				}
				System.out.println();
			}
 }
private static void mersortedArray(int[] a, int[] b, int i, int j, boolean flag, List<List<Integer>> ll,
			List<Integer> temp) {
	
		if(temp.size()>1) {
			
			if(!ll.contains(temp)) {
			ll.add(new ArrayList(temp));
			}
			
		}
		if( j>=b.length) {
			return;
		}
		if(flag==false && i<a.length) {
			if(!temp.isEmpty() && a[i]>=temp.get(temp.size()-1)  ) {
				temp.add(a[i]);
				mersortedArray(a,b,i+1,j,true,ll,temp);
				temp.remove(temp.size()-1);
			}
			else if(temp.isEmpty() ) {
				temp.add(a[i]);
				mersortedArray(a,b,i+1,j,true,ll,temp);
				temp.remove(temp.size()-1);
			}
			mersortedArray(a,b,i+1,j,false,ll,temp);
		}
		else if(flag==true) {
			if( b[j]>=temp.get(temp.size()-1)  ) {
				temp.add(b[j]);
				mersortedArray(a,b,i,j+1,false,ll,temp);
				temp.remove(temp.size()-1);
			}
			mersortedArray(a,b,i,j+1,true,ll,temp);
		
		}
	}
}
