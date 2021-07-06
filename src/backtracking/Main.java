package backtracking;
import java.util.*;
public class Main {
    public static void main(String args[]) {
            Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int m=sc.nextInt();
			
			List<Integer> A=new ArrayList<Integer>();
			List<Integer> B=new ArrayList<Integer>();
			
			for(int i=0;i<n;i++) {
				A.add(sc.nextInt());
			}
			for(int i=0;i<m;i++) {
				B.add(sc.nextInt());
			}
			sc.close();
			int i=0;
			int j=0;
			List<List<Integer>> ll=new ArrayList<List<Integer>>();
			List<Integer> temp=new ArrayList<Integer>();
			mersortedArray(A,B,i,j,false,ll,temp);
			for( List<Integer> sol:ll) {
				for(int sol1:sol) {
					System.out.print(sol1+" ");
				}
				System.out.println();
			}
			
    }
  private static void mersortedArray(List<Integer> a, List<Integer> b, int i, int j, boolean flag, List<List<Integer>> ll,
			List<Integer> temp) {
	
		if(temp.size()>1 && b.contains(temp.get(temp.size()-1))) {
			
			if(!ll.contains(temp)) {
			ll.add(new ArrayList<Integer>(temp));
			}
			
		}
		if( j>=b.size()) {
			return;
		}
		if(flag==false && i<a.size()) {
			if(!temp.isEmpty() && a.get(i)>temp.get(temp.size()-1)  ) {
				temp.add(a.get(i));
				mersortedArray(a,b,i+1,j,true,ll,temp);
				temp.remove(temp.size()-1);
			}
			else if(temp.isEmpty() ) {
				temp.add(a.get(i));
				mersortedArray(a,b,i+1,j,true,ll,temp);
				temp.remove(temp.size()-1);
			}
			mersortedArray(a,b,i+1,j,false,ll,temp);
		}
		else if(flag==true) {
			if( b.get(j)>temp.get(temp.size()-1)  ) {
				temp.add(b.get(j));
				mersortedArray(a,b,i,j+1,false,ll,temp);
				temp.remove(temp.size()-1);
			}
			mersortedArray(a,b,i,j+1,true,ll,temp);
		
		}
	}
}
