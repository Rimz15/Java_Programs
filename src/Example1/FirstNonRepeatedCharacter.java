package Example1;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
	String str = "RReema";
	
	for(int i=0;i<=str.length()-1;i++){
		boolean unique=true;
	for(int j=0;j<=str.length();j++)	{
		if(i!=j&&str.charAt(i)==str.charAt(j)){
			unique=false;
			break;
		}
		if(unique){
			System.out.println("first non repeated character" + " " + str.charAt(i));
		}
	}
	}

	}

}
