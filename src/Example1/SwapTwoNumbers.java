package Example1;

public class SwapTwoNumbers {
	
	public static void SwapTwoNumberswithoutusingthird(){
		int x=40;
		int y=60;
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("value of x is " + x);
		System.out.println("value of y is " + y);
		
	}
	
	public static void SwapTwoNumbersusingThird(){
		int x=40;
		int y=60;
		int z;
		z=y;
		y=x;
	    x=z;
	    System.out.println("value of x is  " +x);
	    System.out.println("value of y is " +y);
		
	}
	
	public static void main(String[] args){
		SwapTwoNumberswithoutusingthird();
		SwapTwoNumbersusingThird();
	}

}
