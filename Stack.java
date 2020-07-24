import java.util.*;
public class Stack {
	int size;
	int top=-1;
	int[] arr;
	Stack(int size)
	{
		this.size=size;
		arr=new int[size];
	}
	void push(int element)
	{
		if(!isFull())
		{
			arr[++top]=element;
			System.out.println("Inserted "+element+" sucessfully!!");
		}
		else {
			System.out.println("Sorry, stack's full");
		}
	}
	int pop()
	{
		
		if(!isNull())
		{
			int ret=arr[top];
			arr[top]=0;
			top--;
			return ret;
		}
		else
		{
			System.out.println("Stack's empty put something before popping");
			return 0;
		}
		
	}
	Boolean isFull()
	{
		if(top+1<size)
		{
			return false;
		}
		else {
			return true;
		}
	}
	Boolean isNull()
	{
		if(top>=0)
		{
			return false;
		}
		else {
			return true;
		}
	}
	public static void main(String[] args)
	{
		Stack stack=new Stack(3);
		stack.push(3);
		stack.push(4);
		stack.push(3);
		stack.push(4);
		stack.pop();
		stack.push(3);
		stack.push(4);
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
	}	
}
