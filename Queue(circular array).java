import java.io.*;
public class arrayQueue {
	int[] arr;
	int start=-1;
	int end=-1;
	int size;
	arrayQueue(int size)
	{
		this.size=size;
		arr=new int[size];
	}
	public void enqueue(int element)
	{
		if(start+1==size)
		{
			start=-1;
		}
		if(start==end&&arr[size/2]!=0)
		{
			System.out.println("Soryy, stack's fulll!!");
		}
		else
		{
			arr[++start]=element;
			System.out.println("Enqueued "+element+" sucessfully");
		}
	}
	public void dequeue()
	{
		if(end+1==size)
		{
			end=-1;
		}
		if(end==start&&arr[size/2]==0)
		{
			System.out.println("Soryy, queue is empty");
		}
		else
		{
			System.out.println("Dequeued "+arr[end+1]+" sucessfully");
			arr[++end]=0;
		}

	}
	public static void main(String[] args)
	{
		arrayQueue trial = new arrayQueue(4);
		trial.enqueue(2);
		trial.enqueue(4);
		trial.enqueue(6);
		trial.dequeue();
		trial.dequeue();
		trial.enqueue(8);trial.enqueue(10);trial.enqueue(12);trial.enqueue(16);
		trial.dequeue();trial.dequeue();trial.dequeue();trial.dequeue();trial.dequeue();trial.dequeue();
		trial.enqueue(2);
		trial.enqueue(7);
		
		
	}
}
