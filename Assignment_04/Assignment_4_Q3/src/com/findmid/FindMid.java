package com.findmid;

import com.linklist.List;

public class FindMid {
	public static void main(String[] args) {
		List l1 = new List();
		l1.addFirst(10);
		l1.addFirst(20);
		l1.addFirst(30);
		l1.addFirst(40);
		l1.addFirst(50);
		l1.addFirst(90);
		
		l1.findMid();
		l1.displayAll();
		
	}
	

}
