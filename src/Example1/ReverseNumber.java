package Example1;

public class ReverseNumber {

	public static void main(String[] args) {
		int n=101;
		int a;
		int c=0;
		int temp=n;
		while(n!=0){
			a=n%10;
			c=c*10+a;
			n/=10;
			}
		if(c==temp){
			System.out.println("number is palindrome");
		}
		else{
			System.out.println("number is not palindrome");	
		}
		
		}
	}


