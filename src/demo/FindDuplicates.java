package demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicates {

	public static void main(String args[])
	{
		int a[]= {2,4,2,3,4,1,2};
		List list = new ArrayList();
		int len = a.length;
		System.out.println("Length of array is " + len);
		
		for(int i=0;i<len;i++)
		{
			for(int j=i;j<len-1;j++)
			{
				if(list.contains(a[i]))
				{
					continue;
				}
				else
				{
					if(a[i]==a[j+1])
					{
						list.add(a[i]);
					}
				}
			} 
		
		}
		System.out.println("Duplicate elements are "+list.toArray().length);
		
		for(Object num : list) 
		{
			System.out.println(num);
		}
	}
}
