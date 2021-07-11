package arrays;

import java.util.ArrayList;

public class ArrayRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr=new ArrayList();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		int k=2;
		rotate(arr,k);
		System.out.println(arr);
	}

	private static void rotate(ArrayList<Integer> arr, int k) {
		// TODO Auto-generated method stub
		roat(arr,arr.size()-k,arr.size());
		roat(arr,0,arr.size()-k);
		roat(arr,0,arr.size());
		
	}

	private static void roat(ArrayList<Integer> arr, int start, int end) {
		// TODO Auto-generated method stub
		int i=start;
		int j=end-1;
		while(i<j) {
			int temp=arr.get(i);
			arr.set(i, arr.get(j));
			arr.set(j, temp);
			i++;
			j--;
		
		}
		
	}

}
