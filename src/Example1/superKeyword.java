package Example1;

class m1{
	int i=10;
}

class m2 extends m1{
	int i =30;
	void print() {
		System.out.println("before super "+ i +" after super "+ super.i);
	}
}


public class superKeyword {

	public static void main(String[] args) {
		m2 ob = new m2();
		ob.print();
		
	}

}
