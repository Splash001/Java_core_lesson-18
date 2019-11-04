package ua.lviv.lgs.task2;

public class Application {
	
	public static void main(String[] args) {

		MyMap<Integer, String> newMap = new MyMap<Integer, String>();
		newMap.addNewObject(1231, "Get to  the choppa");
		newMap.addNewObject(69, "AcDc");
		newMap.addNewObject(333, "Rock");
		newMap.addNewObject(123, "Faster");
		newMap.addNewObject(99, "nature");
		newMap.printAllMap();
		System.out.println();
		System.out.println("Remove from map by key 99:");
		newMap.removeFromMapByKey(99);
		newMap.printAllMap();
		System.out.println();
		System.out.println("Remove from map by value AcDc:");
		newMap.removeFromMapByValue("AcDc");
		newMap.printAllMap();
		System.out.println();
		System.out.println("Print keys:");
		newMap.printMapSet();
		System.out.println();
		System.out.println("Print values:");
		newMap.printMapValue();
	}


}
