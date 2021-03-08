package Example1;



public class ExceptionHandling {
	public static void main (String args[]) {
		int b[]=new int[5];
		try {
			for(int i=0;i<=10;i++) {
			b[i]=i;	
			}
		}
		catch(Exception e) {
			System.out.println("My exception is " +e);
		}
		
		
	}

}
