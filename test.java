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
          ListElement headElement = new ListElement(); 
          ListElement element1 = new ListElement(); 
          ListElement element2 = new ListElement(); 
          ListElement element3 = new ListElement(); 
          ListElement element4 = new ListElement(); 
          ListElement element5 = new ListElement(); 

          headElement.setData(1);
          element1.setData(5);
          element2.setData(7);
          element3.setData(9);
          element4.setData(11);
          element5.setData(13);

          headElement.addElement(element1);
          headElement.addElement(element2);
          headElement.addElement(element3);
          headElement.addElement(element4);
          headElement.addElement(element5);
         
          headElement = headElement.deleteElement(1);
         
          headElement.printLinkedListHead();
         
    }
	

}