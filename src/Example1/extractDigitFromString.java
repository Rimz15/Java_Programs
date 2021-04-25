package Example1;

public class extractDigitFromString {

	public static void main(String[] args) {
		String str = "1abc35de 99fgh, dd11";
		System.out.println(str.replaceAll("[^0-9]", ""));
		

	}

}
