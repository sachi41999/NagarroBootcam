package maths;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x=0.00001;
		long n=21491;
		  long tot=n;
		  if(n<0) {
			  x=1/x;
		  }
	      double y=pow( x, n,tot);
	      System.out.println(y);

	}
	 public static double pow(double x,long n,long tot){
         if(n==0 || n==2*tot){
            return 1.0;
        }
        
        
        double res=x*pow(x,n-1,tot);
        return res;
    }

}
