package Module09Practice24Task02;

import java.util.HashMap;

public class DictionaryModel 
{
	public static final int OP_ADD = 1;
	public static final int OP_DISPLAY=3;
	public static final int OP_EXIT = 5; 
	
	HashMap<String,String> data;
	
	public DictionaryModel()
	{
		data = new HashMap<>();
	}
	
}
