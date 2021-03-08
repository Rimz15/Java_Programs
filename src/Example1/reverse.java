package Example1;

public class reverse {

	public static void main(String[] args) {
		String str = "My name is Reema";
		String rev ="";
		int n = str.length();
		for(int i =n-1;i>=0;i--){
			rev=rev+str.charAt(i);
			System.out.println(rev);
			System.out.println(rev.replace(" ",""));//print without space
		}
		
		}

	}


