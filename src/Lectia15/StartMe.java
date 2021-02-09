package Lectia15;

public class StartMe 
{

	public static void main(String[] args)
	{
		WorkerFull wf = new WorkerFull();
		wf.print();
		
		PresidentFromFull pff = new PresidentFromFull();
		//WorkerAbstract wf = new WorkerAbstract();
		
		PresidentFromAbstract pfs = new PresidentFromAbstract();
		pfs.print();
		
		SecurityFromAbstract sfa = new SecurityFromAbstract();
		sfa.print();
		
		ManagerFromAbstract mfa = new ManagerFromAbstract();
		mfa.print();
	}

}
