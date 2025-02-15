package Problems;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo1 {
	
	public static void main(String[] args) {
		
		//ArrayList allows duplicates, allow heterogeneous data, insertion is preserved
		//Declare ArrayList
		
		ArrayList al = new ArrayList();  // ArrayList with heterogeneous data
		
		//To store only the homogeneous data
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		ArrayList<String> al2 = new ArrayList<String> ();
		
		//We can create ref varialbe with list interface
		List al3 = new ArrayList();
		
		al.add(1);  //add the element in the end of the arraylist
		al.add(56);
		al.add(67);
		al.add("Kani");
		al.add(0.9);
		al.remove(1);
		al.remove("Kani");  //here welcome is removed
		System.out.println(al);  //Insertions order are preserved here
		int size = al.size();
		System.out.println( "Size is " + size);
		
		//insert new element at the particular position
		//add(index,object)
		al.add(1, "Welcome");  //it will add the welcome in the 1st position rest of the values will be moved to the next position
		System.out.println(al); 
		
		//Retrive specific value or object from the arraylist
		Object ss = al.get(1);  //here 1 is index of element or object
		System.out.println(ss);
		//to change some value(to replace)
		al.set(2, "Thangam");  //set new value to the index of 2
		System.out.println(al);  
		
		//search elements - contains() - return either true or false
		System.out.println(al.contains("Welcome"));
		System.out.println(al.contains("welcome"));
		
		//isEmpty() - checks the arraylist is empty or not
		System.out.println(al.isEmpty());  //return true or false
		
		//read the data elements
		//3 approaches
		//Approach -1 for loop
		
		System.out.println("Reading elements using for loop : ");
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		//Approach -2 for each loop
		System.out.println("Reading elements using for..each loop : ");
		for(Object s :al) {  //if its object it can be hold all kind of elements or objects
			System.out.println(s);
		}
		//Approach -3 iterator
		System.out.println("Reading elements using iterator : ");
		
		Iterator it = al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		
	}

}
