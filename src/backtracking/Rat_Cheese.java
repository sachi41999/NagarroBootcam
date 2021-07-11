package backtracking;

import java.util.*;
public class Rat_Cheese {
    static boolean flag=false;
    public static void main(String args[]) {
        flag=false;
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		char arr[][]=new char[n][m];
	
		 for (int i = 0; i < n; i++) {
	            String data = "";
	            if (sc.hasNext()) { // input from user 
	                data = sc.next();
	            } else {
	                break;
	            }
	            for (int j = 0; j < m; j++)
	                arr[i][j] = data.charAt(j); 
	        }
		sc.close();

		int row=0;
		int col=0;
		int arr1[][]=new int[n][m];
		ratPath(row,col,n,m,arr,arr1);
        if(flag){
            for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
        }
        else{
            System.out.println("NO PATH FOUND");
        }
		
    }
    private static void ratPath(int row,int col,int n, int m, char[][] arr,int[][] arr1) {

		

		if(row<0 || col<0 || row>=n || col>=m || arr[row][col]=='X' || arr[row][col]=='1') {
			return;
		}
		
		if(arr[row][col]=='O') {
			arr[row][col]='1';
		}
		if(row==n-1 && col==m-1) {
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					if(arr[i][j]=='1') {
						arr1[i][j]=1;
					}
				}
			}
            flag =true;
			return;
			
		}
		
		
		
		ratPath(row,col-1,n,m,arr,arr1);
		ratPath(row,col+1,n,m,arr,arr1);
		ratPath(row-1,col,n,m,arr,arr1);
		ratPath(row+1,col,n,m,arr,arr1);
		arr[row][col]='O';
	}
}