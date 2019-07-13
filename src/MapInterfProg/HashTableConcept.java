package MapInterfProg;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {

	public static void main(String[] args) {

		//similar to HashMap
		//but it is synchronised
		//stores the value based on key - val pair
		//key is stored in the form of Object as HashCode-----value
		//HashCode is a 32 bit integer number , all the Objects in java as stored in the form of HashCode

		// null key and null value give exception
		Hashtable h1 = new Hashtable();

		h1.put(1, "Raj");
		h1.put(2, "Anandu");
		h1.put(3, "Manuja");
		h1.put(4, "Nikitha");

		//create a clone copy/shallow copy
		Hashtable h2 = new Hashtable();
		h2 = (Hashtable)h1.clone();

		System.out.println(h1);//{4=Nikitha, 3=Manuja, 2=Anandu, 1=Raj}
		System.out.println(h2);//exact copy{4=Nikitha, 3=Manuja, 2=Anandu, 1=Raj}

		h1.clear();//clear the values of h1 but h2 remains same

		System.out.println(h1);//{}
		System.out.println(h2);//{4=Nikitha, 3=Manuja, 2=Anandu, 1=Raj}

		//containsValue/contains
		if(h2.containsValue("Nikitha"))
			System.out.println("Nikitha is present in it");

		//Print all the values from hashtable using --Enumeration--elelments()
		Enumeration enume = h2.elements();

		System.out.println("Print values in sequentially: ");
		while(enume.hasMoreElements())
			System.out.println(enume.nextElement());

		//get the values in the form of entrySet
		System.out.println("Print values by entrySet: ");

		Set s =h2.entrySet();
		System.out.println(s);

		Hashtable h3 = new Hashtable();

		h3.put(1, "Raj");
		h3.put(2, "Anandu");
		h3.put(3, "Manuja");
		h3.put(4, "Nikitha");
		//	h3.put(4, "niki");//allowed same key and same value

		//check whether h2 and h3 are equal
		if(h2.equals(h3))
			System.out.println("h2 and h3 are equal");

		//get the value from akey
		System.out.println(h3.get(2));//Anandu

		//get the hashcode of hash table
		System.out.println("Hashcode value of h3 : "+h3.hashCode());//-713022076

		System.out.println(h3);


		//Generics
		Hashtable<String, String> h4 = new Hashtable<String, String>();
		h4.put("abc", "hai");
		//h4.put(null, "ghi");//nullpointerexception
		//h4.put("dft", null);//nullpointerexception

		System.out.println(h4);//size()







	}

}
