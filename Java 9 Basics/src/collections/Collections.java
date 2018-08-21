package collections;

import java.util.ArrayList;

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
	}
}