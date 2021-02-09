package ModuleThreadsPractice28Task1;

public class ThreadMinimul extends Thread 
{
	MyArray ma;
	
	//constructor cu parametri
	public ThreadMinimul(MyArray ma)
	{
		this.ma = ma;
	}
	
	@Override
	public void run()
	{
		System.out.println("Minumul este : " + ma.minimulLevel2() );
		
		System.out.println("Thread-ul care calculeaza minimul s-a terminat");
	}
}
