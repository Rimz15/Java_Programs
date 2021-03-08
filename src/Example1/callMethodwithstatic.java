package Example1;

public class callMethodwithstatic {
	
	public static int methodtewo(int a, int b)
	{
		int sum = a+b;
		return sum;
		
	}

	public static void main(String[] args) {
	int result=	callMethodwithstatic.methodtewo(6, 7);
        System.out.println(result);
	}

}
