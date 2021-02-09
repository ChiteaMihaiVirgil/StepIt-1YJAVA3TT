package Module09Practice24Task02;

import java.util.Scanner;
import java.util.Set;

public class DictionaryController //mostenirea este : is a (inheritance) folosind extends maybe implements
{

	//has a (encapsulation)
	DictionaryView dv;
	DictionaryModel dm;
	
	public void mainThread() 
	{
		Scanner sc = new Scanner(System.in);
		
		DictionaryModel dm = new DictionaryModel();
		
		int op = -1;
		
		while(op != DictionaryModel.OP_EXIT)
		{
			
			DictionaryView.drawMenu();
			
			op = sc.nextInt();
			
			if( op == dm.OP_ADD) //NullPointerException
			{
				actionOpAdd(sc, dm);
			}
			if( op == dm.OP_DISPLAY)
			{
				actionOpDisplay(dm);
			}
			
			if( op == 4)
			{
				String key;
			
				DictionaryView.askForEnglishWord();
				key = sc.next();
				
				System.out.println(key + " in Spanish is " + dm.data.get( key ));
			}
		}
		
		sc.close();
	}

	private void actionOpDisplay(DictionaryModel dm) 
	{
		Set<String> s = dm.data.keySet();
		Object keys[] = s.toArray();
		int n = s.size();
		for(int i=0;i<n;i++)
		{
			System.out.println(keys[i] + " " + dm.data.get( keys[i] ) );
		}
		System.out.println("\n\n");
		for(String cheie : dm.data.keySet())
		{
			System.out.println(cheie + " " + dm.data.get( cheie ) );
		}
		//System.out.println();
	}

	private void actionOpAdd(Scanner sc, DictionaryModel dm) 
	{
		String key;
		String value;

		DictionaryView.askForEnglishWord();
		key = sc.next();
		
		DictionaryView.askForSpanishWord();
		value = sc.next();
		
		dm.data.put(key, value);
	}

}
