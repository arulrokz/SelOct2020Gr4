package week3.day2;

public class Palindrome {

	public static void main(String[] args) {
String str1 = "Malayalam";
String str2 = str1.toLowerCase();
int count=0;
char[] pal = str2.toCharArray();

for (int i=0;i<pal.length;i++){
	for(int j=pal.length-1;j>0;j--){
		if(pal[i]==pal[j]){
			count++;
			break;
			}
				}
}
System.out.println(count);
if(count==pal.length)
{
	System.out.println("Palindrome");
	}else{
		System.out.println("Not a Palindrome");
	}
	}
}
