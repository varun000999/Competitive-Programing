import java.time.temporal.TemporalQueries;
import java.util.*;
public class Stack {

	Node head;
	Stack(int data)
	{
		Node temp=new Node();
		temp.data=data;
		temp.next=null;
		head=temp;
	}
	class Node
	{
		int data;
		Node next;
	}
	void push(int element)
	{
		if(head==null)
		{
			Node temp1=new Node();
			temp1.data=element;
			head=temp1;
			temp1.next=null;
		}
		else {
		Node temp1=new Node();
		temp1.data=element;
		temp1.next=head;
		head=temp1;
		}
		System.out.println("Pushed "+ element +" Sucessfully");
	}
	int pop()
	{
		if(head==null)
		{
			System.out.println("Nothing to pop");
			return 0;
		}
		else if(head.next==null)
		{
			int dt=head.data;
			head=null;
			System.out.println("popped last element too");
			return dt;
			
		}
		
		else {
		Node ll=head;
		head=head.next;
		ll.next=null;
		System.out.println("Popped "+ ll.data +" Sucessfully");
		return ll.data;
		}
	}
	public static void main(String[] args)
	{
		Stack stack=new Stack(1);
		stack.push(2);
		stack.push(3);
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.push(2);
		stack.push(3);
		stack.pop();
	}
	
	
}
