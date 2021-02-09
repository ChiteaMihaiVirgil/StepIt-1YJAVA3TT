package Lectia15;

public abstract class WorkerAbstract 
{
	public String role;
	
	public WorkerAbstract()
	{
		role = "worker";
	}
	
	public abstract void print();
	
	public void afisStelute(int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.print("*");
		}
	}
	
	public void afisSteluteln(int n)
	{
		afisStelute(n);
		System.out.println();
	}
	
	@Override
	public String toString()
	{
		String text = "";
		text += "Rolul meu in companie este : " + role +"\n";
		
		return text;
	}
}
