package Example1;

interface maths{
	void area(int r);
	double pi = 3.14;
	
}

class type1 implements maths{
	public void area(int r) {
		System.out.println(pi*r*r);
	}
}

public class InterfaceExample {

	public static void main(String[] args) {
		type1 circle = new type1();
		circle.area(5);

	}

}
