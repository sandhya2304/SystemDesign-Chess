package com.helpers;

import java.util.ArrayList;
import java.util.List;




public class ListHelpers 
{
	
	public static <T> List<T> removeDuplicates(List<T> list)
	{
		List<T> newList = new ArrayList<T>();
		for(T elements : list)
		{
			if(!newList.contains(elements))
			{
				newList.add(elements);
			}
		}
		return newList;
	}

}
