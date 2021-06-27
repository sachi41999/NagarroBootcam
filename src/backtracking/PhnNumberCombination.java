package backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhnNumberCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			String s=sc.next();
			List<String> ll=new ArrayList();
			
			ll=letterCombinations(s);
			System.out.println(ll);
			
		}

	}
	 public static List<String> letterCombinations(String digits) {
	        
	        List<String> ll=new ArrayList();
	         if(digits.equals("")){
	            return ll;
	        }
	        else{
	        phnLetterCombo(digits,ll,"");
	        return ll;
	        }  
	    }
	    public static void phnLetterCombo(String digit,List<String> ll,String ans){
	       
	        if(digit.length()==0){
	            ll.add(ans);
	            return;
	        }
	        
	        char c=digit.charAt(0);
	        String s=phnCharacter(c);
	        for(int i=0;i<s.length();i++){
	            phnLetterCombo(digit.substring(1),ll,ans+s.charAt(i));
	        }
	    }
	    public static String phnCharacter(char c){
	        if(c=='2'){
	            return "abc";
	        }
	        if(c=='3'){
	            return "def";
	        }
	        if(c=='4'){
	            return "ghi";
	        }
	        if(c=='5'){
	            return "jkl";
	        }
	        if(c=='6'){
	            return "mno";
	        }
	        if(c=='7'){
	            return "pqrs";
	        }
	        if(c=='8'){
	            return "tuv";
	        }
	        if(c=='9'){
	            return "wxyz";
	        }
	        
	        return "";
	        
	    }

}
