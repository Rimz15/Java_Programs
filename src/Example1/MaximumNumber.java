package Example1;

public class MaximumNumber {
	
public static void main(String[] args) {
	int[] maxnumber = {84,4,5,6,78,54};
	int max = maxnumber[0];
	for(int i=0;i<=maxnumber.length-1;i++){
		if(maxnumber[i]>max){
			max=maxnumber[i];
		}
		
	}
	
System.out.print(max);
	}

}
