package Lectia15;

public class WorkerFull 
{
	public String role;
	
	public WorkerFull()
	{
		role = "worker";
	}
	
	public void print()
	{
		System.out.println( "WorkerFull : " + role );
	}

	
	@Override
	public String toString()
	{
		String text = "";
		text += "Rolul meu in companie este : " + role +"\n";
		
		return text;
	}
}
