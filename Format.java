
import java.util.ArrayList;

public class Format{
	public static void main(String[] args){ //prints out the board 
		
		ArrayList<ArrayList<Character>> board = new ArrayList<ArrayList<Character>>();
		
		
		for(int i = 0; i<6; i++)
		{
			board.add(new ArrayList<Character>());
			
			for(int x = 0; x < 5; x++){
				if(i%2 == 0)
				{
					if (x<5)
					{
						board.get(i).add('\u2610');
					}
					
					
				}
				
				else
				{
					if (x<5)
					{
						board.get(i).add('\u2610');
					}
					
				}
									
					
				
				
			}
		}
		
		
		System.out.print("\nSIX ROOMS BY FIVE TIME SLOTS");
		
		int counter = 0;
		System.out.println("");
		for(int i = 0; i<board.size(); i++)
		{
			
			
				System.out.println(board.get(i));
		
			
		}
		
		
		
		
		
		
		
		
	}











}
