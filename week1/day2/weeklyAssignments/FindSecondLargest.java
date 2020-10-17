package week1.day2.weeklyAssignments;

import java.util.Arrays; 

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data= {3,2,11,4,6,7};
		Arrays.sort(data);
		System.out.print("The Second largest in the Array is: "+data[data.length-2]);
		
		
	}

}
