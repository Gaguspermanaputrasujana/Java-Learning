package bbgames;

public class MainBB 
{
	
	public static void main(String[] args) 
	{
		int guessnum = 0;
		GameInput Input = new GameInput();
	RanBB BBR = new RanBB();
	int ms = (int) (Math.random()*10);
	
	int[] locations = {ms, ms+1, ms+2};
	BBR.assignHitspot1(locations);
	
		
	
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

