package module13_17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestHashMap {

	public static void main(String[] args) {
		Map map = new HashMap();               // 用介面實作一個物件(多形的概念)，一個有MaP的集合
		map.put("one", new Integer(1));
		map.put("two", "2");
		map.put("three", new Float(3.0));
		
		System.out.println(map.get("one"));   	// 指定對應的key
		System.out.println(map.get("two"));
		System.out.println(map.get("three"));
		
		
		// 取出所有的key,包裝為Set的型態
//		Set set = map.keySet();
//
//		Iterator it = set.iterator();
//		while (it.hasNext()) {
//			Object myKey = it.next();
//			System.out.println(myKey + "=" + map.get(myKey));
//		}
	
        //keySet() 方法來自Map介面, 所以所有Map家族成員都適用此方式取值
		
		
		Set set = map.entrySet();
		
		Iterator it = set.iterator();
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry) it.next();
			System.out.println(entry.getKey( )+ " " + entry.getValue());
		}
		
		
	}

}
