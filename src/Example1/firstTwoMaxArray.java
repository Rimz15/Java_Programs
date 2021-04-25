package Example1;

public class firstTwoMaxArray {
public void maxnumbers(int[] nums){
	int max1 =0;
	int max2 =0;
	for(int n: nums){
		
	
	if(max1<n){
		max2=max1;
		max1=n;
	}
	else if(max2<n){
		max2=n;
		
		
	}
}
	
	System.out.println("Max 1"+" "+max1);
	System.out.println("Max 1"+" "+max2);
}
	

	public static void main(String[] args) {
int list[] = {14,15,1,2,3,87,89,65};
firstTwoMaxArray np = new firstTwoMaxArray();
np.maxnumbers(list);
	}}		


