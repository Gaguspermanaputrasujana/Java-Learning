package D1;
import java.util.ArrayList;
public class Dcom {

	private ArrayList<String> loccell;
	
	public void setloc(ArrayList<String> loc)
	{
		loccell = loc;
	}
	
	public String CHit(String userInput) 
	{
	String result = "miss";
	int index = loccell.indexOf(userInput);
	if (index >= 0)
	{
		loccell.remove(index);
		if(loccell.isEmpty())
		{
			result = "killed";
		}
		else
		{
			result = "hit";
		}
	}
	return result;
	}

}
