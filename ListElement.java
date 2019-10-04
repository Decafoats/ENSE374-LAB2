	//Phase 2
	import java.util.*; 

	public class ListElement
	{
		private ListElement next;
		private ListElement previous;
		private int data;
		
		public ListElement()
		{
			this.data = 0;
			this.next = null;
			this.previous = null;
		}

		/** 
		* @param data
		*	an integer to be stored in the node
		* @return
		*	None
		**/
		public void setData(int data)
		{
			this.data = data;
		}
		
		/** 
		* @param None
		* @return
		*	return data stored in the node 
		**/
		public int getData()
		{
			return this.data;
		}
		
		public void addElement(ListElement le)
		{
			ListElement temp = this;
            ListElement point= this;
			ListElement preTemp = null;
			
			if (this.next == null)
			{
                point = le;
                point.next = null;
              	point.previous = this;
                this.next = point;		
			
			}
			
			else
			{
				while (temp.next != null)
				{
					temp = temp.next;
				}
              
              	point = le;
              	point.next = null;
                point.previous = temp;
				temp.next = point;
			}
		}
		
		public ListElement getElement(int index)
		{
			int counter = 0;
			ListElement temp = this;
			
			while (counter != index)
			{
				temp = temp.next;
				counter++;
			}
			
			return temp;
		}
		
		public ListElement deleteElement(int index) 
		{
          
          	if (index == 0)
            {
              ListElement head = this;
			  head = head.next;
              head.previous = null;
              return head;
            }

            else
            {
              int counter = 1;
				ListElement head = this;
				ListElement delete = this.next;
                ListElement point = this;
              
              while (counter != index)
              {
                  head = head.next;
                  delete = delete.next;
                  counter++;
              }
				
				if (delete.next != null)
				{
				  point = delete.next;
				  point.next = delete.next.next;
				  point.previous = head;
				  head.next = point;
				}
				else
				{
					head.next = null;
				}
              return head;
            }
			
		}
		
		public void printLinkedListHead()
		{ 
			ListElement temp = this; 
	   
			System.out.print("LinkedList: "); 
	   
			while (temp != null) 
			{ 
				System.out.print(temp.data + " "); 
				temp = temp.next; 
			} 
		} 
		
		public void printLinkedListTail()
		{ 
			ListElement temp = this; 
	   
			while (temp.next != null) 
			{ 
				temp = temp.next; 
			} 
          
          	ListElement point = temp;
          	System.out.print("LinkedList: "); 
          
          	while (point.previous != null)
            {
              System.out.print(point.data + " "); 
              point = point.previous;
              
            }
          	 System.out.print(point.data + " "); 
		} 
	}	
		
		
		
		
		
		
		
		
		
		
		
		