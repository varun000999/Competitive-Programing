import java.util.*;
import java.lang.*;
import java.io.*;

public class CircularLinkedList
{
	Node head;
    class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
        }
    }
    public void push(int data)
    {
    	Node temp=new Node(data);
    	if(head!=null){
    		Node temp1=head;
    		while(temp1.next!=head)
    		{
    			temp1=temp1.next;
    		}
    		temp.next=head;
    		temp1.next=temp;	
    	}
    	else {
    		temp.next=temp;
    	}
    	head=temp;
    	System.out.println("Sucessfully inserted " + data );
    }
    public void deletenode(int key)
    {
    	int status=0;
    	Node temp3=head;
    	if(head==null)
    	{
    		System.out.println("Sorry list is empty, cannot perform desired operation");
    	}
    	else if(head.data==key)
    	{
    		Node deleted=head;
    		Node temp4=head;
    		while(temp4.next!=head)
    		{
    			temp4=temp4.next;
    		}
    		temp4.next=temp4.next.next;
    		head=head.next;
    		System.out.println("Deleted "+deleted.data+" sucessfully");
    		deleted=null;
    		
    	}
    	else {
    		while(temp3.next!=head)
    		{
    			if(temp3.next.data==key)
	    		{
    				Node deleted=temp3.next;
	    			temp3.next=temp3.next.next;
	    			System.out.println("Deleted "+deleted.data+" sucessfully");
	    			deleted=null;
	    			status=1;
	    			break;
	    		}
    			else {
    				temp3=temp3.next;
    			}
    		}
    		if(status!=1)
    		{
    			System.out.println("Sorry could not found the element which you want to delete,make sure it exist in the linked list.");
    		}
    	}
    }
    public void traverselist()
    {
    	Node temp2=head;
    	while(temp2.next!=head)
    	{
    		System.out.println(temp2.data);
    		temp2=temp2.next;
    	}
    	System.out.println(temp2.data);
    }
    public static void main(String[] args)
    {
    	CircularLinkedList li=new CircularLinkedList();
    	li.head=null;
    	li.push(3);
    	li.push(4);
    	li.push(5);
    	li.push(6);
    	li.traverselist();
    	li.deletenode(3);
    	li.traverselist();
    	li.deletenode(6);
    	li.traverselist();
    	li.push(9);
    	li.traverselist();
    	li.push(12);
    	li.traverselist();
    }

}
