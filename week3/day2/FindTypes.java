package week3.day2;

public class FindTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int letter = 0;
		int space = 0;
		int num = 0;
		int specialChar = 0;
		char[] strArr = test.toCharArray();

		for (int i = 0; i <= strArr.length - 1; i++) {
			Character ch = new Character(strArr[i]);
			if (ch.isDigit(strArr[i])) {
				num++;

			} else if (ch.isLetter(strArr[i])) {
				letter++;
			} else if (ch.isSpace(strArr[i])) {
				space++;
			} else {
				specialChar++;
			}
		}
		System.out.println("Length of String :" + strArr.length);
		System.out.println("Count of numbers :" + num);
		System.out.println("Count of numbers :" + letter);
		System.out.println("Count of numbers :" + space);
		System.out.println("Count of numbers :" + specialChar);

	}

}
