package Example1;

public class DuplicateOfArray {

	public static void main(String[] args) {
		int[] array = {9,1,3,2,2,9};
		int size = array.length;
		for(int i=0;i<size;i++){
			for(int j=i+1;j<size;j++){
				if(array[i]==array[j]){
					System.out.println(array[i]);
					
				}
			
				
			}
		}

	}

}
