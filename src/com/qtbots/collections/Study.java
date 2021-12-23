package com.qtbots.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Study {

	public static void main(String[] args) {
		HashMap<Integer,String> h1=new HashMap<Integer,String>();
		h1.put(1,"vasu");
		h1.put(4, "vasudha");
		Set s=h1.entrySet();
		Iterator it=s.iterator();
		while(it.hasNext()) {
			Map.Entry mEntry=(Map.Entry)it.next();
			System.out.println("key is"+mEntry.getKey()+"\tvalue"+mEntry.getValue());
		}
	}

}
