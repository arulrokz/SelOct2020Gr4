package week1.day2.weeklyAssignments;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayOne = {3,2,11,4,6,7};
		int[] arrayTwo = {1,2,8,4,9,7};
		for(int i=0;i<=arrayOne.length-1;i++) {
			for(int j=0;j<=arrayTwo.length-1;j++) {
				if (arrayOne[i]==arrayTwo[j]) 
					System.out.print(arrayOne[i]+",");
				
			}
		}

	}

}
