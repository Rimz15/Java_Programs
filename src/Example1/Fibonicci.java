package Example1;

public class Fibonicci {
	
public static void main(String[] args) {
		int n=0;
		int n1=1;
		int sum=0;
		System.out.println(n+" "+n1);
		for(int i=0;i<=9;i++){
			sum=n+n1;
			n=n1;
			n1=sum;
		System.out.println(sum);	
		}

	}

}
