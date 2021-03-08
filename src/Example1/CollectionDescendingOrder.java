package Example1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class CollectionDescendingOrder {
	
		public static void main(String[] args){
			List list = new ArrayList<>();
			list.add("50");
			list.add("25");
			list.add("30");
			list.add("75");
			list.add("80");
			Iterator i1 = list.iterator();
			System.out.println("printing the list");
			while(i1.hasNext()){
				System.out.println(i1.next());
			}
			Comparator cmp = Collections.reverseOrder();
			Collections.sort(list,cmp);
			System.out.println("sorted list");
			Iterator i2 = list.iterator();
			while(i2.hasNext()){
				System.out.println(i2.next());
			}
			
		}
}
		
			



	
	
