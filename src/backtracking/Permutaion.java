package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Permutaion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int nums[]=new int[n];
			for(int i=0;i<n;i++) {
				nums[i]=sc.nextInt();
			}
			List<List<Integer>> ll=new ArrayList();
			
			ll=permute(nums);
			System.out.println(ll);
			
		}

	}

	private static List<List<Integer>> permute(int[] nums) {
		// TODO Auto-generated method stub
		List<List<Integer>> ll=new ArrayList();
        List<Integer> temp=new ArrayList();
        boolean visited[]=new boolean[nums.length];
       // Arrays.fill(visited,false);
        
        permut(nums,ll,temp,visited);
        
        return ll;
		
	}

	   public static void permut(int nums[],List<List<Integer>> ll,List<Integer> temp,boolean visited[]){
	        
	        if(temp.size()==nums.length){
	            ll.add(new ArrayList(temp));
	            return ;
	        }
	        
	        for(int i=0;i<nums.length;i++){
	            if(visited[i]==false){
	              temp.add(nums[i]);
	              visited[i]=true;    
	              permut(nums,ll,temp,visited);
	              temp.remove(temp.size()-1);
	              visited[i]=false;    
	                
	          }   
	        }
	      
	        
	    }

}
