package Example1;

public class OccurrenceChracter {

	public static void main(String[] args) {
		String str = "Reema";
		int i,j,k;
		char c,ch;
		i = str.length();
		for(c='A';c<='Z';c++){
			k=0;
		for(j=0;j<i;j++){
			ch=str.charAt(j);
			if(ch==c){
				k++;
			}
		}
			if(k>0)
			System.out.println("the character"+" "+ c+ "repeated"+" "+k+"times");
		}
			
		
		

	}

}
