package Queue;

import java.util.ArrayList;
import java.util.List;

public class Queue 
{
	//int -> Integer
	//char -> Character
	
	final int MAX_SIZE = 3;
	
	List<Character> q = new ArrayList<>();
	
	int n;
	
	public boolean isEmptyLevel1()
	{
		boolean isIt = false;
		if(q.isEmpty())
		{
			isIt = true;
		}
		
		return isIt;
	}
	
	public boolean isEmptyLevel2()
	{
		boolean isIt = false;
		if( n == 0 )
		{
			isIt = true;
		}
		return isIt;
	}
	
	public boolean isFullLevel1()
	{
		boolean isIt = false;
		if( q.size() ==  MAX_SIZE )
		{
			isIt = true;
		}
		
		return isIt;
	}
	
	public boolean isFullLevel2()
	{
		return q.size() == MAX_SIZE;
	}
	
	public boolean isFullLevel3()
	{
		return n == MAX_SIZE;
	}
	
	public void enqueue(char c)
	{
		q.add(c); //APPEND adica la coada..adica la sfarsitul listei
		
		n = n + 1;
	}
	
	public void dequeue()
	{
		q.remove(0); //FIFO
		
		n = n - 1;
	}
	
	public void show()
	{
		
	}
}
