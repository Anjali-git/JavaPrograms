package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class SortListOfStrings {

	public static void main(String args[])
	{
		List<String> list = new ArrayList<String>();
		
		List<String> templist = new ArrayList<String>(Arrays.asList("P","A","B","F","Z","Q"));
		
		list.add("Prajakta");
		list.add("Madhuri");
		list.add("Prakash");
		list.add("Shubhangi");
		list.add("Abhijeet");
		
		Collections.sort(list);
		
		for(String l : list)
		{
			System.out.println(l);
		}
		
	}
}
