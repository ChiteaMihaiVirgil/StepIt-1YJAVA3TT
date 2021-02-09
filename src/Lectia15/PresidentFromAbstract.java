package Lectia15;

public class PresidentFromAbstract extends WorkerAbstract 
{
	
	public PresidentFromAbstract()
	{
		role = "president";
	}

	@Override
	public void print()
	{
		afisStelute(role.length());
	
		System.out.println();
		System.out.println(role);
	}



}
