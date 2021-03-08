package Example1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ReverseUsingCollection {

	public static void main(String[] args) {
		List list = new ArrayList<>();
		list.add("10");
		list.add("20");
		list.add("30");
		Iterator itr = list.iterator();
		System.out.println("printing the list");
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
       Iterator itr2 = list.iterator();
       Collections.reverse(list);
       System.out.println("Reverse order");
       while(itr2.hasNext()){
			System.out.println(itr2.next());
		}
	}

}
