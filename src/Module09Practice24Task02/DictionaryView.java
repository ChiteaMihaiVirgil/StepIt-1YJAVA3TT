package Module09Practice24Task02;

public class DictionaryView 
{
	public static void drawMenu()
	{
		System.out.println(DictionaryModel.OP_ADD + ".Add");
		System.out.println(DictionaryModel.OP_DISPLAY + ".Display");	
		System.out.println(DictionaryModel.OP_EXIT + ".Exit");
	}
	
	public static void askForEnglishWord()
	{
		System.out.println("Introduceti cuvantul in Engleza");
	}
	
	public static void askForSpanishWord()
	{
		System.out.println("Introduceti cuvantul in Spaniola");
	}
	
}
