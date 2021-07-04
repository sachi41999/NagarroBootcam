package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestStringWithoutRepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			String s=sc.next();
			int x=lengthOfLongestSubstring(s);
			System.out.println(x);
		}

	}
	 public static int lengthOfLongestSubstring(String s) {
	        if(s.length()==0){
	            return 0;
	        }
	        Map<Character,Integer> mp=new HashMap();
	        int max=0;
	        int start=0;
	        int last=0;
	        while(last<s.length()){
	            char ch=s.charAt(last);
	            if(mp.containsKey(ch)){
	                while(true){
	                    char cc=s.charAt(start);
	                    
	                  
	                    if(cc==ch){
	                        mp.remove(ch);
	                        start++;
	                        break;
	                    }
	                    mp.remove(cc);
	                    start++;
	                }
	                
	            }
	            mp.put(ch,1);
	            if(mp.size()>max){
	                max=mp.size();
	            }
	            last++;
	        }
	        return max;
	    }
	}


