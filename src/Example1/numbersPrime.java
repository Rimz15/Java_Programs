package Example1;

public class numbersPrime {

	public static void main(String[] args) {
		for(int i=1;i<=100;i++){
			boolean isprime = true;
			for(int j=1;j<i;j++){
				if(i%2==0){
					isprime=false;
					break;
				}
			}
				
				if(isprime){
					System.out.println(i+" ");
				}
			}
			
		}

	

}
