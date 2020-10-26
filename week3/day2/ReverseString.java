package week3.day2;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "feeling good";
char[] strArr = test.toCharArray();
for (int i=strArr.length-1;i>=0;i--){
	System.out.print(strArr[i]);
}
	}

}
