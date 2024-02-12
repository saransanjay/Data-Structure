package Stack;

public class Stack
{
	private Node top;
	private int height =0;
	
	class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data = data;
			next = null;
		}
	}
	Stack(int data)
	{
		Node newNode = new Node(data);
		top = newNode;
		height++;

	}
	public void Push(int data)
	{
		Node  newNode = new Node(data);
		if(height==0)
		{
			top = newNode;
		}
		else
		{
			newNode.next = top;
			top = newNode;
		}
		height++;
	}
	public Node pop()
	{
		if(height==0)
		{
			return null;
		}
		Node temp = top;
		top = top.next;
		temp.next = null;
		height--;
		return temp;
	}
	public void display()
	{
		Node temp = top;
		for(int i = 0;i<height;i++)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	public static void main(String args[])
	{
		Stack stack = new Stack(0);
		stack.Push(1);
		stack.Push(2);
		stack.Push(3);
		stack.display();
	}
}
