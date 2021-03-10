package bbgames;
import java.util.*;
public class RanBB {
	//honestly, just using arraylist just now. i dont even does a 
	//generate of the number or asking user input lol
	public ArrayList<String> Hitspot;
	
	public void assignHitspot (ArrayList<String> spot)
	{
		Hitspot = spot;
	}
	
	static int RN ()
	{ 
		int ms = (int) (Math.random()*10);
		
		return ms;
	}
	
public String checker (String userinput)
{
	String result = "missed";
	int indexs = Hitspot.indexOf(userinput);
	if (indexs >= 0)
	{
		Hitspot.remove(indexs);
		if (Hitspot.isEmpty())
		{
			result = "kill";
		}
		else 
		{ 
			result = "hit"; 
		}
	}
	return result;
}
}

