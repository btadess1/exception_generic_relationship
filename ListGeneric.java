package list_generic;

import java.util.*;
public class ListGeneric {

	public static void main(String[] args) {
		// Create a list
		List list = new ArrayList();
		//add mixed values into the list
		list.add(12);
		list.add("12");
		list.add(3);
		list.add("Hello");
		
		//now try to iterate through the list and cast the values into Integer
		int i = 0;
		while(i < list.size()){
			try{
				int castedVal = (Integer)list.get(i);
				System.out.println(castedVal);
			}catch(ClassCastException e){
				System.out.println("Cannot be casted to Integer:" + e.getMessage());
			}
			i++;
		}
		
		//There is a better way of doing this though, we can restrict the list
		//to accept only one type using generic type
		List<Integer> list2 = new ArrayList<>();
		//list2 prevents you from adding any type except Integers
		//in this way you may not need to use the try/catch as you are guaranteed 
		//to get the expected value from the list

	}

}
