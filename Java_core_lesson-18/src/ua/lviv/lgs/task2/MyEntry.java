package ua.lviv.lgs.task2;

public class MyEntry<K,V> {
	
	K obj1;
	V obj2;
	
	public MyEntry() {
		
	}
	
	public MyEntry(K obj1, V obj2) {
		super();
		this.obj1 = obj1;
		this.obj2 = obj2;
	}

	@Override
	public String toString() {
		return "MyEntry [obj1=" + obj1 + ", obj2=" + obj2 + "]";
	}

	public K getObj1() {
		return obj1;
	}

	public V getObj2() {
		return obj2;
	}

	public void setObj1(K obj1) {
		this.obj1 = obj1;
	}

	public void setObj2(V obj2) {
		this.obj2 = obj2;
	}
}
