package hashmap.easy;

import java.util.HashMap;
import java.util.Map;

public class DuplicateHashCodes {

	public static void main(String[] args) {
		
		Map<String, Student> map = new HashMap<>();
		Student s1 = new Student("Arya");
		Student s2 = new Student("Ovi");
		map.put("1", s1);
		map.put("1", s2);
		
		System.out.println("Map: " + map);
		
	}

}
