package week1.day2.weeklyAssignments;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		System.out.println();
		for(int i=0;i<=arr.length-1;i++ ) {
			for(int j=1;j<=arr.length-1;j++) {
			
			if(arr[i]!=arr[j]) 
			System.out.print(j+","); 
			}
		
		}
	}

}
