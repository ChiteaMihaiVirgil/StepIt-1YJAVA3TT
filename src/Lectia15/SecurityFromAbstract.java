package Lectia15;

public class SecurityFromAbstract extends WorkerAbstract 
{
	public SecurityFromAbstract()
	{
		role = "security";
	}
	
	@Override
	public void print() 
	{
		afisSteluteln(7);
		afisSteluteln(1);
		afisStelute(1); System.out.println(" " + role);
		afisSteluteln(1);
		afisSteluteln(7);
	}

}
