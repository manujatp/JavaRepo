package CollectionsProg;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {

		// int a[3]; static array- size is fixed

		// ArrayList is a dynamic array
		// can contains duplicate values
		// maintains insertions order
		// not synchronized(because of that is little slower than other collections)
		// allows random access to fetch the element because it stores the values in the
		// basis of indexes

		// non generic ArrayList we can add any data type values to non generic
		// ArrayList
		ArrayList ar = new ArrayList();
		ar.add(10);// 0
		ar.add(20);// 1
		ar.add(30);// 2

		System.out.println("Size of the array is : " + ar.size());// 3
		ar.add(40);// 3
		ar.add(60);// 4

		System.out.println("Size of the array is : " + ar.size());// 5
		System.out.println(ar.get(4));// 60

		ar.add("Test");
		ar.add(23.8);
		ar.add('s');

		// print all the values in an ArrayList
		// for loop
		System.out.println("Array Elements: ");
		for (int i = 0; i < ar.size(); ++i)
			System.out.println(ar.get(i));

		//non generic vs generic

		// Generic ArraList -- after jdk1.1 allowing generic

		ArrayList<Integer> arint = new ArrayList<Integer>();

		arint.add(100);
		// arint.add("Selenium"); not app[licable for other data types

		ArrayList<String> arstring = new ArrayList<String>();
		arstring.add("test");
		arstring.add("Selenium");

		Employee e1 = new Employee("Raj", 25, "Mechanical");
		Employee e2 = new Employee("Anandu", 20,"Science");
		Employee e3 = new Employee("Nikitha", 19, "Arts");

		ArrayList<Employee> aremp = new ArrayList<Employee>();
		aremp.add(e1);
		aremp.add(e2);
		aremp.add(e3);
		Employee emp;
		Iterator<Employee> it = aremp.iterator();
		while(it.hasNext()) {
			emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);

		}

		///////////////

		//addall()

		ArrayList<String> ars = new ArrayList<String>();
		ars.add("java");
		ars.add("cpp");
		ars.add("c");

		ArrayList<String> ars1 = new ArrayList<String>();
		ars1.add("selenium");
		ars1.add("qtp");
		ars1.add("cucumber");

		ars1.addAll(ars);
		System.out.println("combined ars1 plus ars");
		for(int i=0; i<ars1.size();++i)
			System.out.println(ars1.get(i));//ars+ars1 elements 


		//removeall()
		ars1.removeAll(ars);
		System.out.println("Removed ars elelments");
		for(int i=0; i<ars1.size();++i)
			System.out.println(ars1.get(i));// remove all the ars elements

		//retainall() retain only common values

		ArrayList<String> ars2 = new ArrayList<String>();
		ars2.add("java");
		ars2.add("cpp");
		ars2.add("c");

		ArrayList<String> ars3 = new ArrayList<String>();
		ars3.add("selenium");
		ars3.add("cpp");
		ars3.add("cucumber");

		ars3.retainAll(ars2);
		System.out.println("common");
		for(int i=0; i<ars3.size();++i)
			System.out.println(ars3.get(i));




	}

}
