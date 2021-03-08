package Example1;

public class SmallestNumber {

	public static void main(String[] args) {
		int[] arr = {4,5,6,2,3,4,5,56};
		int c=arr[0];
		for(int i =1;i<arr.length;i++){
			if(c>arr[i]){
				c=arr[i];
			}
		}
			System.out.println(c);
		}

	}


