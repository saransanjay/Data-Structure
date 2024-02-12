package Queue;

public class Queue
{
	private Node front;
	private Node  rear;
	private int length = 0;
	class Node
	{
		int data ;
		Node next;
		
		Node(int data)
		{
			this.data= data;
			next = null;
		}
	}
	Queue(int data)
	{	
		Node newNode = new Node(data);
		front = newNode;
		rear = newNode;
		length++;
	}
	public void enQueue(int data)
	{
		Node newNode = new Node(data);
		if(length==0)
		{
			front = newNode;
			rear = newNode;
		}
		else
		{
			rear.next = newNode;
			rear = newNode;	
		}
		length++;
	}
	public Node deQueue()
	{
		if(length==0)
		{
			return null;
		}
		Node temp = front;
		if(length==1)
		{
			rear = null;
			front = null;
		}
		else
		{
			front = front.next;
			temp.next = null;
		}
		length--;
		return temp;	
	}
	public void display()
	{
		Node temp = front;
		for(int i =0;i<length;i++)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	public static void main(String args[])
	{
		Queue queue = new Queue(0);
		queue.enQueue(1);
		queue.enQueue(2);
		queue.enQueue(3);
		queue.deQueue();
		queue.display();
	}
}