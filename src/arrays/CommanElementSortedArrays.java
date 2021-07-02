package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CommanElementSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int arr1[]= {1,2,5,7,8,11,19,21,22,28,30};
			int arr2[]= {2,3,6,7,15,19,21,28,29,30};
			int arr3[]= {2,7,8,15,19,21,22,23,28,30};
			;
			System.out.println(commanElement(arr1,arr2,arr3));
		}

	}

	private static List<Integer> commanElement(int[] arr1, int[] arr2, int[] arr3) {
		// TODO Auto-generated method stub
		List<Integer> arr=new ArrayList();
		int i=0;
		int j=0;
		int k=0;
		while(i<arr1.length && j<arr2.length && k<arr3.length) {
			int min=mini(arr1[i],arr2[j],arr3[k]);
			if(arr1[i]==arr2[j] && arr2[j]==arr3[k] && arr1[i]==arr3[k]) {
				arr.add(arr1[i]);
				
			}
			if(arr1[i]==min) {
				i++;
			}
			if(arr2[j]==min) {
				j++;
			}
			if(arr3[k]==min) {
				k++;
			}
		}
		
		
		return arr;
	}

	private static int mini(int i, int j, int k) {
		// TODO Auto-generated method stub
		return i<j?(i<k?i:k):(j<k?j:k);
		
	}

}
