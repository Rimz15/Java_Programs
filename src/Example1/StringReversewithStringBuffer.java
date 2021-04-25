package Example1;

import java.util.Arrays;
import java.util.List;

public class StringReversewithStringBuffer {
	
	
	public static void main(String[] args) {
		String str = "My name is Reema";
		
		char[] chr = str.toCharArray();
		for(int i=chr.length-1;i>=0;i--){
			System.out.println(chr[i]);
		StringBuffer st = new StringBuffer(str);
		st.reverse();
		System.out.println(st);	
		}
		
		

	}
}


