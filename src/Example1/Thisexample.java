package Example1;


public class Thisexample {
	int rollno;
	String name;
	float fee;
	Thisexample(int rollno, String name, float fee){
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
		
	}
	void dispaly(){
		System.out.println(name+" "+rollno+" "+fee);
	}
	
	
	public static void main(String args[]){
		Thisexample p1 = new Thisexample(11,"Reema",700f);
		p1.dispaly();
	}
		
		
	}

	

