package ua.lviv.lgs.task2;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class MyMap<K, V> extends MyEntry<K, V> {

	LinkedHashMap<K, V> hashMap = new LinkedHashMap<>();
	
	public MyMap() {
		super();
	}
	
	public MyMap(K obj1, V obj2) {
		super(obj1, obj2);
	}
	
	public void addNewObject(K obj1, V obj2) {
		hashMap.put(obj1, obj2);
	}
	
	public void removeFromMapByKey(K obj1) {
		hashMap.remove(obj1);
	}
	
	public void removeFromMapByValue(V obj2) {
		hashMap.values().remove(obj2);
	}
	
	public void printMapSet() {
		Iterator<Entry<K, V>> iter = hashMap.entrySet().iterator();
		while (iter.hasNext()) {
			Entry<K, V> next = iter.next();
			System.out.println(next.getKey().toString());
		}
	}
		
		public void printMapValue() {
			Iterator<Entry<K, V>> iter2 = hashMap.entrySet().iterator();
			while (iter2.hasNext()) {
				Entry<K, V> next = iter2.next();
				System.out.println(next.getValue().toString());
			}
		}
		
		public void printAllMap() {
			Iterator<Entry<K, V>> iter3 = hashMap.entrySet().iterator();
			while (iter3.hasNext()) {
				Entry<K, V> next = iter3.next();
				System.out.println(next.getKey().toString() + "<--->" + next.getValue().toString());
			}
		}
}
