package ua.lviv.lgs.task1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Application {
	
	public static void main(String[] args) {
		
		//To add different types of data to List we can use the <Object> type, but that is a bad practice.
		
		List<Object> data = new ArrayList<>();
		data.add(999);
		data.add("logos");
		data.add(11121.213);

		System.out.println(data);
		System.out.println();
		
		//We can use Map as another method
		
		Map<Integer, String> newMap = new HashMap<Integer, String>();
		newMap.put(83, "Let's go");
		newMap.put(3123, "Running");
		Iterator<Entry<Integer, String>> iter = newMap.entrySet().iterator();
		while (iter.hasNext()) {
			Entry<Integer, String> next = iter.next();
			System.out.println(next.getKey().toString() + " <-> " + next.getValue().toString());
		}
	}
}
