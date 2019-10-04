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
			ListElement preTemp = null;
			
			if (this.next == null)
			{
				this.next = le;
			
			}
			
			else
			{
				while (temp.next != null)
				{
					temp = temp.next;
				}
				
				temp.next = le;
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
			int counter = 1;
			ListElement head = this;
			ListElement delete = this.next;
			
			if (index == 0)
			{
				head = this.next;
				this.next = head;
			}
			while (counter != index)
			{
				head = head.next;
				delete = delete.next;
				counter++;
			}
			
			head.next = delete.next;
			
			return head;
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
		
	}	
		
		
		
		
		
		
		
		
		
		
		
		