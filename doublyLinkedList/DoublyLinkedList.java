package doublyLinkedList;

public class DoublyLinkedList
{
	private Node head;
	private Node tail;
	private int length =0;
	
	class Node
	{
		int data;
		Node next;
		Node pre;
		
		Node(int data)
		{
			this.data = data;
			next = null;
			pre = null;
		}
	}
	DoublyLinkedList(int data)
	{
		Node newNode = new Node(data);
		head = newNode;
		tail = newNode;
		length++;
	}
	//Inserting
	public void insertAtBeginning(int data)
	{
		Node newNode = new Node(data);
		if(length==0)
		{
			head = newNode;
			tail = newNode;
		}
		else
		{
			newNode.next = head;
			head.pre = newNode;
			head = newNode;
		}
		length++;
	}
	public boolean insertAtPosition(int index , int data)
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
		Node temp = get(index);
		Node pre = temp.pre;
		pre.next = newNode;
		newNode.pre = pre;
		newNode.next = temp;
		temp.pre = newNode;
		length++;
		return true;
	}
	public void insertAtEnd(int data)
	{
		Node newNode = new Node(data);
		if(length==0)
		{
			head = newNode;
			tail = newNode;
		}
		else
		{
			tail.next = newNode;
			newNode.pre = tail;
			tail = newNode;
		}
		length++;		
	}
	//Deleting
	public Node deleteAtBeginning()
	{
		if(length==0)
		{
			return null;
		}
		Node temp = head;
		if(length ==1)
		{
			head = null;
			tail = null;
		}
		else
		{
			head = head.next;
			head.pre = null;
			temp.next = null;
			
		}
		length--;
		return temp ;
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
		 Node temp = get(index);
		 Node pre = temp.pre;
		 Node aft = temp.next;
		 pre.next = aft;
		 aft.pre = pre;
		 temp.next = null;
		 temp.pre = null;	
		 length--;
		 return temp;
	}
	public Node deleteAtEnd()
	{
		if(length==0)
		{
			return null;
		}
		Node temp = tail;
		if(length ==1)
		{
			head = null;
			tail = null;
		}
		else
		{
			tail = tail.pre;
			temp.pre = null;
			tail.next = null;			
		}
		length--;
		return temp ;
	}
	//Get
	public Node get(int index)
	{
		if(index<0||index>=length)
		{
			return null;
		}
		Node temp;
		if(index<length/2)
		{
			temp = head;
			for(int i =0;i<index;i++)
			{
				temp = temp.next;
			}
		}
		else 
		{
			temp = tail;
			for(int i = length-1;i>index;i--)
			{
				temp = temp.pre;
			}
		}
		return temp;
	}
	//Displaying
	public void display()
	{
		Node temp = head;
		for(int i = 0 ;i < length;i++)
		{
			System.out.print(" "+temp.data);
			temp = temp.next;
		}
	}
	public static void main(String args[])
	{
		DoublyLinkedList dll = new DoublyLinkedList(4);
		dll.insertAtBeginning(2);
		dll.insertAtBeginning(1);
		dll.insertAtBeginning(0);
		dll.insertAtEnd(5);
		dll.insertAtPosition(2,3);
		dll.deleteAtPosition(3);
		dll.display();

	}
}