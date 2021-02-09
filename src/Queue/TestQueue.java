package Queue;

public class TestQueue 
{

	public static void main(String[] args) 
	{
		Menu m = new Menu();
		int IS_EMPTY = m.add("IsEmpty");
		int IS_FULL  = m.add("IsFull");
		int ENQUEUE  = m.add("Enqueue");
		int DEQUEUE  = m.add("Dequeue");
		int SHOW     = m.add("Show");
		int EXIT     = m.add("Exit");
		
		Queue q = new Queue();
		
		int op = -1;
		while( op != EXIT)
		{
			m.show();
			
			op = m.getOption();
			
			if(op == IS_EMPTY)
			{
				if(q.isEmptyLevel2())
				{
					System.out.println("For sure is empty !");
				}
				else
				{
					System.out.println("Something is waiting");
				}
			}
			if(op == IS_FULL)
			{
				if(q.isFullLevel3())
				{
					System.out.println("Almost Queue overflow !");
				}
				else
				{
					System.out.println("Let them in !!!");
				}
			}
			if(op == ENQUEUE)
			{
				//adaugati voi citirea unui caracter de la utilizator
				q.enqueue('f');
			}
			if(op == DEQUEUE)
			{
				q.dequeue();
			}
			if(op == SHOW)
			{
				q.show();
			}
			
		}
		
	}

}
