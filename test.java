/*
	ENSE 374 - LAB 2
	Name: Xiao Chu Zhao
	SID: 200386192
	
	Run.java
	Date: September 26, 2019
*/

import java.util.*; 

public class test
{
	public static void main(String[] args) 
	{
		ListElement element1 = new ListElement(); 
		ListElement element2 = new ListElement(); 
		ListElement element3 = new ListElement(); 
		ListElement element4 = new ListElement(); 
		ListElement element5 = new ListElement(); 
		
		element1.setData(5);
		element2.setData(7);
		element3.setData(9);
		element4.setData(11);
		element5.setData(13);
		
		element1.addElement(element2);
		element1.addElement(element3);
		element1.addElement(element4);
		element1.addElement(element5);
		
		element1.deleteElement(4);
	    element1.printLinkedListHead();
	}
	

}