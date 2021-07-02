package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysAbsoluteValueSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int arr[]= {-8,-5,-3,3,-6,-8,9};
			sortArray(arr);
			System.out.println(Arrays.toString(arr));
		}

	}

	private static void sortArray(int[] arr) {
		// TODO Auto-generated method stub
		int i=0;
		int j=arr.length-1;
		
		while(i<j) {
			if(Math.abs(arr[i])>Math.abs(arr[i+1])) {
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
				j--;
			}
			else {
			if(Math.abs(arr[i])>=Math.abs(arr[j])) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j--;
			}
			else {
				j--;
			}
			}
			
		}
		
	}

}
