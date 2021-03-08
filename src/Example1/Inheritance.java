package Example1;

class a1{
	int x,j;
	void set(int i,int y) {
		x=i;
		j=y;
	}
	
}

class a2 extends a1{
	int total;
	void sum() {
		total=x+j;
	}
}

public class Inheritance {

	public static void main(String[] args) {
		a2 ob = new a2();
		ob.set(10,20);
		ob.sum();
		System.out.println(ob.total);
		
		
		
		

	}

}
