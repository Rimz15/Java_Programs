package Example1;

public class PrimeNumberJava {

	public static void main(String[] args) {
		int n=59;
		boolean isPrime=true;
		int remainder;
		
			for(int i=2;i<=n/2;i++){
				remainder=n%i;
				if(remainder==0){
					isPrime=false;
					break;
					
				}
			}
				if(isPrime)
					System.out.println("prime number" +" "+ n);
				
				else
					System.out.println("not a prime number" +" "+ n);	
				
			}
		

	}


