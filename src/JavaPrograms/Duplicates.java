package JavaPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Duplicates {

	public static void main(String[] args) {

		int a[] = { 3, 5, 6, 3, 4, 7 };
		int n = a.length;
		String names[] = { "Java", "Javascript", "Ruby", "C", "Python", "Java", "C", "Java" };
		int len = names.length;
		System.out.println("************");
		// using for loop worst solution, time complexity is O(n*n)
		for (int i = 0; i < n - 1; ++i)
			for (int j = i + 1; j < n; ++j)
				if (a[i] == a[j]) {
					System.out.println("Duplicate number is " + a[i]);

				}

		System.out.println("------------------------");
		for (int i = 0; i < len - 1; ++i)
			for (int j = i + 1; j < len; ++j)
				if (names[i].equalsIgnoreCase(names[j])) {
					System.out.println("Duplicate string is " + names[i]);

				}
		System.out.println("$$$$$$$$$$$$$$$");
		// using HashSet : JavaCollection: It stores unique values time complexity is On
		Set<String> store = new HashSet<String>();

		for (String name : names) {
			if (store.add(name) == false) {
				System.out.println("Duplicate element is : " + name);
			}
		}

		// using HashMap O(2n)
		Map<String, Integer> storemap = new HashMap<String, Integer>();
		Integer count;

		for (String name : names) {
			count = storemap.get(name);
			if (count == null) {
				storemap.put(name, 1);
			} else {
				storemap.put(name, ++count);
			}

		}
		//Set<Entry<String,Integer>> entryset = storemap.entrySet();
		System.out.println("@@@@@@@@@@@");
		
		for(Entry<String, Integer> entry : storemap.entrySet()) {
			if(entry.getValue()>1)
				System.out.println("Duplicated element is :"+ entry.getKey());
		}

	}

}
