package linkedList;
public class LinkedList {

	private Node head = null;
	private Node tail = null;
	private int length = 0;

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
	void insertAtBeginning(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			Node temp = head;
			head = newNode;
			newNode.next = temp;
		}
		length++;
	}
	void insertAtPoistion(int pos, int data) {
		if(pos==0)
		{
			insertAtBeginning(data);
		}
		else if(pos==length)
		{
			insertAtEnd(data);
		}
		else if(pos>length)
		{
			System.out.println("index error");
		}
		else
		{
			Node newNode = new Node(data);
			if (head == null) {
				head = newNode;
				tail = newNode;
			} else {
				Node temp = head;
				for (int i = 1; i < pos; i++) 
				{
					temp = temp.next;
				}
				newNode.next = temp.next;
				temp.next = newNode;
			}
			length++;
		}
	}
	void insertAtEnd(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
		length++;
	}

	//Deleting
	void deleteAtBeginning()
	{
		Node temp = head;
		if(head != null)
		{
			head = head.next;
		}
		temp.next = null;
		length--;
	}
	void deleteAtPosition(int pos)
	{
		if(pos==0)
		{
			deleteAtBeginning();
		}
		else if(pos==length-1)
		{
			deleteAtEnd();
		}
		else if(pos>length-1)
		{
			System.out.println("index error");
		}
		else
		{
			Node temp = head;
			Node pre  =  head;
			for (int i = 0; i < pos ; i++)
			{
				pre = temp;
				temp = temp.next;			
			}
			pre.next = temp.next;
			temp.next = null;
			length--;			
		}
	}
	void deleteAtEnd()
	{
		Node temp = head;
	    for (int i = 0; i < length-1; i++)
	    {
	    	temp = temp.next;
	    }
	    tail = temp;
	    temp =null;
		length--;
	}
	//Searching
	int search(int data)
	{
		Node temp = head;
		for(int i = 0;i<length;i++)
		{
			if(temp.data==data)
			{
				System.out.println("Data Present in index "+i);
				return 0;
			}
			temp = temp.next;	
		}
		System.out.println("Data is not Present");
		return 0;
	}

	// Printing
	void display() 
	{
		if (head != null) 
		{
			Node temp = head;
			for (int i = 0; i < length; i++) 
			{
				System.out.print(" " + temp.data);
				temp = temp.next;
			}
		}
	}

}