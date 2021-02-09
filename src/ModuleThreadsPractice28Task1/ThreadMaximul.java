package ModuleThreadsPractice28Task1;

public class ThreadMaximul extends Thread 
{
	MyArray ma;
	
	//constructor cu parametri
	public ThreadMaximul(MyArray ma)
	{
		this.ma = ma;
	}
	
	@Override
	public void run()
	{
		System.out.println("Maximul este : " + ma.maximulLevel2() );
		
		System.out.println("Thread-ul care calculeaza maximul s-a terminat");
	}
}
