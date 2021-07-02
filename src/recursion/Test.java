package recursion;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="23*10";
		int sum=addString(s);
		System.out.println(sum);

	}
	private static int addString(String ss) {
		// TODO Auto-generated method stub
		int a=0;
		int b=0;
		String s="";
		String s1="";
		for(int i=0;i<ss.length();i++) {
			if(ss.charAt(i)=='*' ||ss.charAt(i)=='-' ||ss.charAt(i)=='+' ||ss.charAt(i)=='/'  ) {
				a=Integer.parseInt(s);
				s="";
				s1+=ss.charAt(i);
			}
			else {
				s+=ss.charAt(i);
			}
		}
		b=Integer.parseInt(s);
		if(s1.equals("*")) {
			return a*b;
		}
		else if(s1.equals("-")) {
			return a-b;
		}
		else if(s1.equals("+")) {
			return a+b;
		}
		else if(s1.equals("/")) {
			return a/b;
		}
		
		return b;
	}

}
