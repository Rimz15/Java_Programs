package Example1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pract {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String question = "what is your age";
		String choice1="23";
		String choiceTwo="26";
		String choiceThree ="29";
		String userInput = input.next();
		if(userInput.equals(choiceTwo)){
			System.out.println("congrats");
			}
		else{
			System.out.println("your answer is wrong");
		}
//		boolean repeatSong=true;
//		while(repeatSong){
//			System.out.println("play song in repeat");
//			String userinput = input.next();
//			if(userinput.equals("yes")){
//				repeatSong=false;	
//			}
//		}
		
		
		//System.out.println("play next song");
//		int x=5;
//		x=10;
//		System.out.println(x);
//		Scanner input = new Scanner(System.in);
//		x = input.nextInt();
//		System.out.println(x);
//		
////		String fruit = "Strawberries";
////		System.out.println(fruit.substring(2,5));
//	List<Boolean> list = new ArrayList<>();
//	list.add(true);
//	list.add(Boolean.parseBoolean("False"));
//	list.add(Boolean.TRUE);
//	System.out.println(list.size());
//	System.out.print(list.get(1));
	}

}
