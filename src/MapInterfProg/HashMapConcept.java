package MapInterfProg;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import CollectionsProg.Employee;

public class HashMapConcept extends Employee {

	public HashMapConcept(String name, int age, String dept) {
		super(name, age, dept);

	}

	public static void main(String[] args) {

		//HashMap is a class implements Map interfaces
		//extends AbstractMap
		//it contains only unique elements
		//stores the values in the form of key-value pair
		//it may have one null key and multiple null values
		//it maintains no order
		//non-synchronised---> not thread safe--- better in the case of performance 
		//fail-fast conditions : concurrent modification exception --updation(mod or deletion) of the data is not synchronised

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Raj");
		hm.put(2, "Anandu");
		hm.put(3, "Nikitha");
		hm.put(4, "Manuja");

		System.out.println(hm.get(3));//Nikitha
		System.out.println(hm.get(6));//giving null --no exception because its not storing based on index

		//Entry set is used for iterating

		for(Entry<Integer, String> m :hm.entrySet() ) {

			System.out.println(m.getKey()+ " "+m.getValue());

		}

		System.out.println(hm);
		hm.remove(2);
		System.out.println(hm);

		HashMap<Integer, Employee> emphm = new HashMap<Integer, Employee>();


		Employee e1 = new Employee("Raj", 25, "Mechanical");
		Employee e2 = new Employee("Anandu", 20,"Science");
		Employee e3 = new Employee("Nikitha", 19, "Arts");

		emphm.put(1,e1);
		emphm.put(2, e2);
		emphm.put(3, e3);

		Employee e;

		//traverse the hashmap:
		for(Entry<Integer, Employee> ent : emphm.entrySet()) {
			e = ent.getValue();
			System.out.println("Employee no: "+ ent.getKey()+" info "+ e.name+ " "+e.age+ " "+e.dept );
		}







	}

}
