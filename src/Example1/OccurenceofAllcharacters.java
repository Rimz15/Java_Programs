package Example1;

import java.util.HashMap;
import java.util.Map.Entry;

public class OccurenceofAllcharacters {
	
	   static void countCharacter(String inputString){
		   HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		   char[] strarr = inputString.toCharArray();
		   for(char c: strarr){
			   if(hm.containsKey(c)){
				   hm.put(c, hm.get(c)+1);
			   }
			   
			   else{
				   hm.put(c, 1);
			   }
		   }
					  
				  for(Entry<Character,Integer> entry :hm.entrySet()){
					  System.out.println(entry.getKey()+" "+entry.getValue());
				  
			   }
	   }
				
				  public static void main(String[] args){
					  String inputString = "Reema";
					  countCharacter(inputString);
				  }
			   
		   }
	   