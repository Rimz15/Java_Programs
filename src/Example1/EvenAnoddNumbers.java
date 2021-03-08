package Example1;

public class EvenAnoddNumbers {

	public static void main(String[] args) {
		int c[] = {5,7,2,3,98,45};
		for(int i=0;i<c.length;i++){
			if(c[i]%2==0){
				System.out.println("Even Numbers " + c[i]);
		}
		if(c[i]%2!=0){
			System.out.println("Odd Numbers " + c[i]);
		}
			
		}

	}

}
