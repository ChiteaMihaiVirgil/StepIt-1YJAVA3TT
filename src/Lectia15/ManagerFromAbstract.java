package Lectia15;

public class ManagerFromAbstract extends WorkerAbstract 
{
	public ManagerFromAbstract()
	{
		role ="manager";
	}
	
	@Override
	public void print() 
	{
		for(int i=1;i<6;i++)
		{
			if(i == 3)
			{
				afisStelute(i);
				System.out.println(" " + role);
			}
			else
			{
				afisSteluteln(i);
			}
		}

	}

}
