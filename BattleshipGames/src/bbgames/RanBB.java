package bbgames;
import java.util.*;
public class RanBB 
{
	//honestly, just using arraylist just now. i dont even does a 
	//generate of the number or asking user input lol
	public ArrayList<String> Hitspot2;
	public int[] Hitspot1;
	public int hitnum;
	
	public void assignHitspot1 (int[] spot)
	{
		
		int[] Hitspot1 = spot;
	}
	
	public void assignHitspot2 (ArrayList<String> spot)
	{
		Hitspot2 = spot;
	}
	
	static int RN ()
	{ 
		int ms = (int) (Math.random()*10);
		
		return ms;
	}
	
public String checker1 (String userinput)
{
	int guess = Integer.parseInt(userinput);
	String result = "missed";
	for (int cell : Hitspot1)
	{
	if (guess == cell )
		{
		result = "hit";
		hitnum++;
		break;
		
		}
		
	}
	return result;
}
	
public String checker2 (String userinput)
	{
		String result = "missed";
		int indexs = Hitspot2.indexOf(userinput);
		if (indexs >= 0)
		{
			Hitspot2.remove(indexs);
			if (Hitspot2.isEmpty())
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

