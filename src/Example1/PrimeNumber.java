package Example1;

public class PrimeNumber {

	public static void main(String[] args) {
		int remainder;
		int n=18;
		boolean isprime=true;;
		for(int i=2;i<=n/2;i++){
			remainder= n%i;
			if(remainder==0){
				isprime=false;
				break;
			}
		}
			if(isprime)
				System.out.println("prime number");
				
			
			else
				System.out.println("not a prime number");
			
		}

	}


