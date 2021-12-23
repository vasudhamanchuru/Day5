package com.qtbots.collections;

import java.util.LinkedList;
import java.util.Queue;

public class Qdemo {

	public static void main(String[] args) {
		Queue<String> q1 = new LinkedList<String>();
		
	q1.add("vasu");
	q1.add("narmada");
	q1.add("uday");
	q1.add("abhi");
	q1.add("vikas");
	q1.add("deepak");
	
	System.out.println(q1);
	
	System.out.println(q1.remove());// removes the first given input element
	System.out.println(q1);
	System.out.println(q1.element());// it shows only head of the element do not remove any elements
	System.out.println(q1);
	System.out.println(q1.poll());
	System.out.println(q1);// removes the head of the element and returns the head of the element


	
	}

}
