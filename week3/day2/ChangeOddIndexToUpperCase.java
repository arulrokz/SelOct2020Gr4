package week3.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String test = "changeme";
		System.out.println("Original Text :"+test);
		System.out.print("Changed Text :");
		char[] strArr = test.toCharArray();
		for (int i = 0; i < strArr.length; i++) {
		
			int j = i % 2;
			if (j == 1) {
				Character ch = new Character(strArr[i]);

				System.out.print(ch.toUpperCase(strArr[i]));

			} else {
				System.out.print(strArr[i]);
			}
		}
	}

}
