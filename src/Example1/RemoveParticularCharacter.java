package Example1;

public class RemoveParticularCharacter {

	public static void main(String[] args) {
		String str= "Reema";
		System.out.println(charAtRemove(str,3));
	}
	public static String charAtRemove(String str,int p){
		return str.substring(0, p)+str.substring(p+1);
	}

}
