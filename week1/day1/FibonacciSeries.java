package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
		int i;
		int j=1;
		int k=0;
		System.out.print(k);
		for( i=1;i<=num;++i) {
			int sum = j+k;	
			System.out.print(", "+sum);
			j=k;
			k=sum;
		}

	}

}
