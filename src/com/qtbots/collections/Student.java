package com.qtbots.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Student {

	public static void main(String[] args) {
		HashMap<Integer,String> hstudent=new HashMap<Integer,String>();
		hstudent.put(22, "vasu");
		hstudent.put(23, "vasudha");
		hstudent.put(27, "vasudhar");		
		Set s=hstudent.entrySet();
		Iterator it=s.iterator();
		while(it.hasNext()) {
			Map.Entry mEntry=(Map.Entry)it.next();
			System.out.println("key is "+mEntry.getKey()+"\tvalue "+mEntry.getValue());
		}
		
		
		
	}

}
