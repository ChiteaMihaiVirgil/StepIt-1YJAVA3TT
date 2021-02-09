package ModuleThreadsPractice28Task1;

public class EntryPointForArrayWithThreads 
{

	public static void main(String[] args) 
	{
		MyArray ma = new MyArray();
		
		ma.readDataLevel3();
		//ma.printData();
		//ma.minimulLevel1();
		//System.out.println("Minumul este : " + ma.minimulLevel2() );
		
		
		ThreadMinimul tmin = new ThreadMinimul( ma );
		tmin.start(); // metoda start proneste threadul adica da controlul metodei run
		
		ThreadMaximul tmax = new ThreadMaximul( ma );
		tmax.start(); // metoda start proneste threadul adica da controlul metodei run
		
		System.out.println("Thread-ul principal s-a incheiat");
	}

}
