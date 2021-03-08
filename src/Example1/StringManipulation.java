package Example1;

public class StringManipulation {

	public static void main(String[] args) {
		//Strings are immutable
	String str3 = "Java";
	str3.concat("oops");
	System.out.println(str3);
    //example 2
	String str1 ="value1";
	String concat = str1.concat("value2");
	System.out.println(concat);
	//String methods
	System.out.println("ABC".equalsIgnoreCase("abc"));
	System.out.println("345678902060".replace('0', '4'));
	System.out.println("abcdefghij".substring(3,7));
	System.out.println("ABC".toLowerCase());
	System.out.println("abc".toUpperCase());
	System.out.println("   abc   ".trim());
	}

}
