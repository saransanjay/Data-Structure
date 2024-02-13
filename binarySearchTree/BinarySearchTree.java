package binarySearchTree;

public class BinarySearchTree
{
	Node root;
	class Node
	{
		int data;
		Node right;
		Node left;
		
		Node(int data)
		{
			this.data = data;
			right = null;
			left = null;
		}
	}
	public boolean insert(int data)
	{
		Node newNode = new Node(data);
		if(root==null)
		{
			root = newNode;
			return true;
		}
		else 
		{
			Node temp = root;
			while(true)
			{
				if(temp.data==data)
				{
					return false;
				}
				if(data<temp.data)
				{
					if(temp.left==null)
					{
						temp.left = newNode;
						return true;
					}
						temp=temp.left;
				}
				else
				{
					if(temp.right==null)
					{
						temp.right = newNode;
						return true;
					}
						temp=temp.right;						
				}
			}
		}	
	}
//	public Node contains(int data)
//	{
//		if(root == null)
//		{
//			return null;
//		}
//		Node temp = root;
//		if(temp.data == data)
//		{
//			return temp;
//		}
//		while(true)
//		{
//
//			if(data<temp.data)
//			{
//				temp = temp.left;
//				if(temp==null)
//				{
//					return temp;
//				}
//				if(temp.data==data)
//				{
//					return temp;
//				}
//			}
//			else
//			{
//
//				temp = temp.right;
//				if(temp==null)
//				{
//					return temp;
//				}
//				if(temp.data==data)
//				{
//					return temp;
//				}
//				
//			}
//		}
//	}
	public Node contains(int data)
	{
		Node temp = root;
		while(temp!=null)
		{
			if(data<temp.data)				
			{
				temp= temp.left;
			}
			else if(data>temp.data)
			{
				temp= temp.right;
			}
			else
			{
				return temp;
			}
		}	
		return temp;	
	}
	public static void main(String args[])
	{
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(47);
		bst.insert(21);
		bst.insert(76);
		bst.insert(18);
		bst.insert(52);
		bst.insert(82);
		bst.insert(27);
		System.out.println(bst.contains(18).data);
		System.out.println(bst.contains(17));
	}
}
