package Example1;



public class thread {

	public static void main(String[] args) {
		Thread t = new Thread();
		try {
			for(int i =0;i<=10;i++) {
				System.out.println(i);
				t.sleep(1000);
			}

	}
		
		catch(Exception e) {
			System.out.println(e);
		}

}
}


