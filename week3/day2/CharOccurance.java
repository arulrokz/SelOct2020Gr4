package week3.day2;

public class CharOccurance {

	public static void main(String[] args) {
		String str = "welcome to chennai";
		int count = 0;
		char[] strArray = str.toCharArray();
		int charLength=strArray.length;
		System.out.println("Character length : "+charLength);
		for(int i=0;i<=charLength-1;i++){
			if(strArray[i]=='e'){
				count++;
			}
			}
		System.out.println("No. of e :"+count);
	}

}
