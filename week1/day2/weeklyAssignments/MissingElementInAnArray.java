package week1.day2.weeklyAssignments;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		System.out.println();
		for(int j=0;j<arr.length-1;j++) {
			int i=j+1;
			if(arr[j]!=i) {
				System.out.print(i); 
				break;
			}


		}
	}

}
