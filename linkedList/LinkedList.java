package linkedList;

public class LinkedList {

	private Node head = null;
	private Node tail = null;
	 int length = 0;

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}
	LinkedList(int data) {
		Node newNode = new Node(data);
		head = newNode;
		tail = newNode;
		length = 1;
	}
	
	// inserting
	public void insertAtBeginning(int data) {
		Node newNode = new Node(data);
		if (length == 0) {
			head = newNode;
			tail = newNode;
		} else 
		{
			newNode.next = head;
			head = newNode;
		}
		length++;
	}
	
	public boolean insertAtPosition(int index, int data) 
	{
		if(index<0||index>length)
		{
			return false;
		}
		if(index == 0)
		{
			insertAtBeginning(data);
			return true;
		}
		if(index == length)
		{
			insertAtEnd(data);
			return true;
		}
		Node newNode = new Node(data);
		Node temp = get(index-1);
		newNode.next = temp.next;
		temp.next = newNode;
		length++;
		return true;
	}
	public void insertAtEnd(int data) {
		Node newNode = new Node(data);
		if (length == 0) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
		length++;
	}
	
	//Deleting
	public Node deleteAtBeginning()
	{
		if(length == 0)
		{
			return null;
		}
		Node temp = head;
		head = head.next;
		temp.next = null;
		length--;
		if(length == 0)
		{
			tail = null;
		}
		return temp;
	}
	
	public Node deleteAtPosition(int index)
	{
		if(index<0||index>=length)
		{
			return null;
		}
		if(index == 0)
		{
			return deleteAtBeginning();
		}
		if(index == length-1)
		{
			return deleteAtEnd();
		}
			Node pre = get(index-1);
			Node temp = pre.next;
			pre.next = temp.next;
			temp.next = null;
			length--;
			return temp;
	}
	
	public Node deleteAtEnd()
	{
		if(length==0)
		{
			return null;
		}
		Node temp = head;
		Node pre = head;
		if(length == 1)
		{
			head = null;
			tail = null;
		}
		else 
		{
			while(temp.next!=null)
			{
				pre = temp;
				temp = temp.next;		
			}
			tail = pre;
			tail.next = null;
		}
		length--;
		return temp;
	}
	
	//Get
	public Node get(int index)
	{
		if(index<0||index>=length)
		{
			return null;
		}
		Node temp = head;
		for(int i = 0 ; i < index ; i++)
		{
			temp = temp.next;
		}
		return temp;
	}
	
	//Set
	public boolean set(int index, int data) {
		Node temp = get(index);
		if(temp != null)
		{
			temp.data = data;
			return  true;
		}
		return false;
	}
	
	//Searching
	void search(int data)
	{
		Node temp = head;
		for(int i = 0;i<length;i++)
		{
			if(temp.data==data)
			{
				System.out.println("Data Present in index "+i);
				return;
			}
			temp = temp.next;	
		}
		System.out.println("Data is not Present");
	}

	// Printing
	void display() 
	{
		Node temp = head;
		while (temp != null) 
		{	
				System.out.print(" " + temp.data);
				temp = temp.next;
		}
	}

}
