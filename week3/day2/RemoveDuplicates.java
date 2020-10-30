package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String[] str = text.split(" ");
		Set<String> st = new HashSet<String>();
		Collections.addAll(st, str);
		List alist = new ArrayList(st);
		Collections.sort(alist);
		System.out.print(alist);

	}

}
