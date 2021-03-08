package Example1;

public class Split {

	public static void main(String[] args) {
		String str = "My Name";
		String[] name = str.split(" ");
		int nameindex=1;
		for(String names:name){
			System.out.println(nameindex+" "+names);
		
nameindex++;
	}
	}
}
