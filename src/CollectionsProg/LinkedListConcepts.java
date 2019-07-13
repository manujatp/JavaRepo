package CollectionsProg;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcepts {

	public static void main(String[] args) {
	
		
	//Singly linkedlist consists two parts data and reference to next list
	//head is pointing to first node
	// last node's reference part should be null..no more reference
		
		LinkedList<String> li = new LinkedList();
		
		//add
		li.add("test");
		li.add("automation");
		li.add("framework");
		
		//print
		System.out.println("Linkedlist content is : "+li);
		
		//addfirst
		li.addFirst("Web");
		
		//addlast
		li.addLast("selenium");
		
		//print
		System.out.println("Modified linked list is : "+li);
		
		//get
		System.out.println(li.get(0));
		
		//set
		li.set(0, "UI");
		System.out.println("Content of modified Linked List is : "+li);
		
		//remove first and last element
		li.removeFirst();
		li.removeLast();

		System.out.println("Content of modified Linked List is : "+li);
		
		li.remove(2);

		System.out.println("Content of modified Linked List is : "+li);
		
		//iterating 
		//for loop
		System.out.println("For loop");
		for(int i=0; i<li.size();++i)
			System.out.println(li.get(i));
		
		//advanced for loop
		System.out.println("Advanced for loop");
		for(String str: li)
			System.out.println(str);
		
		//iterator
		System.out.println("using iterator");
		Iterator it = li.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//while
		System.out.println("While");
		int num =0;
		while(li.size()>num) {
			System.out.println(li.get(num));
			++num;
		}
		

	}

}
