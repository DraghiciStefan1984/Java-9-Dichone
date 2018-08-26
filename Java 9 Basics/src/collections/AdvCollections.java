package collections;

import java.util.HashSet;
import java.util.Set;

public class AdvCollections
{
	public static void main(String[] args)
	{
		int[] count= {1,2,4,6,5,2,3};
		Set<Integer> intSet=new HashSet<>();
		try
		{
			for(int i=0; i<count.length; i++)
			{
				intSet.add(i);
			}
		} catch (Exception e)
		{
			// TODO: handle exception
		}
	}
}