package linkedList;

public class reverseList {
	public static class Node {
		public int data;
		public Node next;
		
		public Node(){};
		public Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	int i = 0;
	Node actualHead =  null;
	Node temp = null;
	public static Node head=null;
	public Node reverseRecur2(Node current){
		if(current==null){
			return null;
		}
		if(actualHead == null)
			actualHead = current;
		if(current.next==null){
			head = current;
			temp = head;
			return null;
		}
		
		reverseRecur2(current.next);
		
		/*-------------method 1-----------*/
		/*
		current.next.next = current;
		//*/
		
		/*-------------method 2-----------*/
		///*
		temp.next = current;
		temp = current;
		//*/
		/*---------------common in both ---------*/
		if(current == actualHead)
			current.next = null;
		return head;
	}
	public void display(Node head){
		//
		Node currNode = head;
		while(currNode!=null){
			System.out.print("->" + currNode.data);
			currNode=currNode.next;
		}
	}
	public static void main(String args[])
	{
		Node head = new Node(10);
		head.next = new Node(8);
		head.next.next = new Node(6);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(2);
		System.out.println("Original List :");
		reverseList r= new reverseList();
		r.display(head);
		System.out.println(" Reversed List ");
		Node x =  r.reverseRecur2(head);
		r.display(x);
	}
	
	
}
	