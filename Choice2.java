import java.util.ArrayList;

public class Choice2{
	
	
	
	
	public static void main(String[] args)
	{
		ArrayList<Integer> choice = new ArrayList<Integer>();//represents a students 5 choices  sam 1,11,8,6,16
		ArrayList<Integer> choiceCounter = new ArrayList<Integer>();//add the counter to this instead of variabless
		
		for (int i = 0; i < 18; i++)
		{
			choiceCounter.add(0);
		}
		

		for (int j = 0; j < 70; j++)
		{
			//add choice array
			
			
			for(int i = 1; i <= 18; i++)
			{
			
				if (choice.get(0) == i || choice.get(1) == i || choice.get(2) == i || choice.get(3) == i || choice.get(4) == i)
				{
					tempchoiceCount = choiceCounter.get(i - 1);
					choiceCounter.set(i - 1, tempchoiceCount+1);
					//need to figure out a way to add to the right counter
				}
			
			}
		
		
			System.out.print(choiceCounter);
			
			
			
			
		}
	}
}
