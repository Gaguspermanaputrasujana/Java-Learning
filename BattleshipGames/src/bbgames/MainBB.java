package bbgames;

public class MainBB 
{
	
	public static void main(String[] args) 
	{
		GameInput Input = new GameInput();
	boolean alive = true;
	
	while (alive == true)
	{
		String guess = Input.GetInput(" Enter your guess");
		guess = guess + " bolerian";
		System.out.print(guess);
		alive = false;
	}
	
	
	}
	public static int guess(int imo)
	{ int belavi = imo + 2;
		int belavid = belavi;
		return belavid;
	}
}

