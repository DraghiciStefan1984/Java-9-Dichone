package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Collections
{
	public static void main(String[] args)
	{
		//arrays
		int[] intArray= {1,2,3,4,5,6};
		System.out.println(intArray[2]);
		
		//array list - dynamic array
		ArrayList<String> stringArrayList=new ArrayList<>();
		stringArrayList.add("dasdas");
		stringArrayList.add("ytryht");
		stringArrayList.add("dastrefdas");
		stringArrayList.add("crec");
		stringArrayList.add("dauyiyiyusdas");
		
		for (String string : stringArrayList)
		{
			System.out.println(string);
		}
		
		stringArrayList.remove(2);
		
		// hash maps
		HashMap<String, Integer> users=new HashMap<>();
		
		users.put("user1", 1);
		users.put("user2", 2);
		users.put("user3", 3);
		users.put("user4", 4);
		
		Iterator<?> iterator=users.entrySet().iterator();
		while(iterator.hasNext())
		{
			Map.Entry pair=(Entry) iterator.next();
			System.out.println(pair.getKey()+":"+pair.getValue());
		}
	}
}