package backtracking;
import java.util.*;
public class SplitArray {
static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		count=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		boolean visit[]=new boolean[n];
		arraySplit(arr,visit,0,n);
		System.out.println(count);

	}
	private static void arraySplit(int[] arr, boolean[] visit, int prev,int n) {
		// TODO Auto-generated method stub
		if(checkSum(visit,arr)==true) {
			count++;
			String s1="";
			String s2="";
			for(int i=0;i<visit.length;i++) {
				if(visit[i]==true) {
					s1+=arr[i]+" ";
				}
				else if(visit[i]==false) {
					s2+=arr[i]+" ";
				}
			}
			
			System.out.println(s1+"and "+s2);
			
			return;
		}
		
		
		for(int i=prev;i<n;i++) {
		
			visit[i]=true;
			arraySplit(arr,visit,i+1,n);
			visit[i]=false;
		
		}
		
	}
	private static boolean checkSum(boolean[] visit, int[] arr) {
		// TODO Auto-generated method stub
		int sum1=0;
		int sum2=0;
	
		for(int i=0;i<arr.length;i++) {
			if(visit[i]==true) {
				sum1+=arr[i];
			}
			else {
				sum2+=arr[i];
			}
		}
		
		if(sum1==sum2) {
			return true;
		}
		return false;
	}

}
