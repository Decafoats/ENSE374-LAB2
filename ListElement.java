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
		while (temp.next != null)
		{
			temp = temp.next;
		}
		temp.next = new ListElement(data, null);
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
		
		return temp.data;
	}
	
	public ListElement deleteElement(int index) 
	{
		int counter = 0;
		ListElement temp = this;
		
		while (counter != index)
		{
			temp = temp.next;
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	