package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class zeroOneSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int arr[]= {0,0,0,1,0,0,1,0,1,0};
//			for(int i=0;i<n;i++) {
//				arr[i]=sc.nextInt();
//			}
			
			//brute force
			//bruteforceSort(arr);
			//System.out.println(Arrays.toString(arr));
			
			
			
			//efficient way without auxiliary space
			efficientSort(arr);
			System.out.println(Arrays.toString(arr));
		}
	}

	private static void efficientSort(int[] arr) {
		// TODO Auto-generated method stub
		int i=0;
		int j=arr.length-1;
		while(i<j) {
			if(arr[i]==1 && arr[j]==0) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			if(arr[i]==0) {
				i++;
			}
			if(arr[j]==1) {
				j--; 
			}
		}
		
		
	}

	private static void bruteforceSort(int[] arr) {
		// TODO Auto-generated method stub
		ArrayList<Integer> zero=new ArrayList();
		ArrayList<Integer> one=new ArrayList();
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				zero.add(arr[i]);
			}
			if(arr[i]==1) {
				one.add(arr[i]);
			}
		}
		int j=0;
		for(int i=0;i<zero.size();i++) {
			arr[j]=zero.get(i);
			j++;
		}
		for(int i=0;i<one.size();i++) {
			arr[j]=one.get(i);
			j++;
		}
	}

}
