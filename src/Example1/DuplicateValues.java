package Example1;

public class DuplicateValues {
	

public static void main(String[] args) {
		String[] str ={"India", "USA", "Ruby","India","Ruby","India","Peas","Peas"};
		for(int i=0;i<str.length;i++){
			for(int j=i+1;j<str.length;j++){
				if(str[i].equals(str[j])){
					System.out.println(str[i]);
				}
			}
		}
	}

}
