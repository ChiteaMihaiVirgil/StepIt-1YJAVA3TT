package ModuleThreadsPractice28Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyArray 
{
	List<Integer> lista = new ArrayList<>(); 
	
	public void readDataLevel1()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduceti o serie de numere terminate cu 0");
		
		int nr;
		
		nr = sc.nextInt();
		
		while( nr != 0)
		{
			lista.add( nr );
			
			nr = sc.nextInt();			
		}
		
		System.out.println("Citirea s-a terminat");
	}
	
	public void readDataLevel2() //cu structura repetitiva cu testul la inceput : PRETESTARE
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduceti o serie de numere terminate cu 0");
		
		int nr = -1;
		
		while( nr != 0)
		{
			nr = sc.nextInt();
			
			if( nr != 0)
			{
				lista.add( nr );
			}
		}
		
		System.out.println("Citirea s-a terminat");
	}
	
	public void readDataLevel3() //cu structura repetitiva cu testul la sfarsit POSTTESTARE
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduceti o serie de numere terminate cu 0");
		
		int nr;
		
		do
		{
			nr = sc.nextInt();
			
			if( nr != 0)
			{
				lista.add( nr );
			}
		}
		while( nr != 0);
		
		System.out.println("Citirea s-a terminat");
	}
	
	
	
	public void printData()
	{
		for(Integer nr : lista)
		{
			System.out.print( nr + " ");
		}
		System.out.println();
	}
	
	
	public void minimulLevel1()
	{
		int minim = 2147483647; 
		          //2100000000
		
		int i = 0;
		
		System.out.println("Incep");
		for(Integer nr : lista)
		{
			System.out.println("Iteratia : " + i + " " + minim + " > " + nr);
			if( minim > nr)
			{
				minim = nr;
			}
			
			i = i +1;
		}
		System.out.println("Gata");
		System.out.println(minim);
	}
	
	public int minimulLevel2()
	{
		int minim = 2147483647; 
		          //2100000000

		for(Integer nr : lista)
		{
			if( minim > nr)
			{
				minim = nr;
			}
		}
		
		return minim;
	}
	
	public int maximulLevel2()
	{
		int maxim = -2147483648; 
		          //-2100000000

		for(Integer nr : lista)
		{
			if( maxim < nr)
			{
				maxim = nr;
			}
		}
		
		return maxim;
	}
	
}
