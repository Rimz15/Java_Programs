package Example1;

public class ThirdLargestNumber {

	public static void main(String[] args) {
		int c[] = {45,87,34,21,23,167,98};
		int temp,size;
		size=c.length;
		for(int i=0;i<size;i++){
			for(int j=i+1;j<size;j++){
				if(c[i]>c[j]){
					temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}
				
				System.out.println(c[size-3]);
			}
		}

	
