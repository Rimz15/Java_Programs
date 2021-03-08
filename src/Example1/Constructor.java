package Example1;

class box{
	double length,width,height;
	
	box(){
		System.out.println("constructor has started");
		length=5;
		width=10;
		height=20;
	}
	
	double volume() {
		return width*length*height;
	}
}



public class Constructor {
	public static void main(String args[]) {
		box ob = new box();
		double vol = ob.volume();
		System.out.println(vol);
	}
}
		
		
	


