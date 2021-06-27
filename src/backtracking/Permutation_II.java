package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Permutation_II {

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
			
			ll=permuteUnique(nums);
			System.out.println(ll);
			
		}

	}
	 public static List<List<Integer>> permuteUnique(int[] nums) {
	        List<List<Integer>> ll=new ArrayList();
	        List<Integer> temp=new ArrayList();
	        Arrays.sort(nums);
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
              if(i>0 && nums[i]==nums[i-1] && visited[i-1]==false){
                  continue;
                  
              }
           
	            else if(visited[i]==false ){
                  
	              temp.add(nums[i]);
	              visited[i]=true;    
	              permut(nums,ll,temp,visited);
	              temp.remove(temp.size()-1);
	              visited[i]=false;    
	                
	          }   
	        }
	      
	        
	    }

}
