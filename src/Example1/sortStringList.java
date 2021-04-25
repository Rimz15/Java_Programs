package Example1;

import java.util.Arrays;

public class sortStringList {

	public static void main(String[] args) {
		String[] inputList = {"Jan","Feb","Mar","April","May", "Jun", "Jul",
				"aug", "Sep", "Oct", "nov", "Dec" };
		System.out.println("unsorted list");
		showList(inputList);
		Arrays.sort(inputList);
		System.out.println("sorted list");
		showList(inputList);
		Arrays.sort(inputList,String.CASE_INSENSITIVE_ORDER);
		System.out.println("Case Sensitive Order");
		showList(inputList);

	}
	
	public static void showList(String[] array) {
		for (String str : array) {
			System.out.print(str + " ");
		}
		System.out.println();
	}

}


