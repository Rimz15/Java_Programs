package Example1;

import java.util.ArrayList;

public class AddTwoArrayList {

	public static void main(String[] args) {
		ArrayList<String> array01 = new ArrayList<String>();
		array01.add("Kisht1");
		array01.add("Kisht2");
		array01.add("kisht3");
		
		ArrayList<String> array02 = new ArrayList<String>();
		array02.add("Reema1");
		array02.add("Reema2");
		array02.add("Reema3");
		
		ArrayList<String> arraycombined = new ArrayList<String>();
		arraycombined.addAll(array01);
		arraycombined.addAll(array02);
		for(String temp:arraycombined){
			System.out.println(temp);
		
		
	}
	}}
		
		
	


