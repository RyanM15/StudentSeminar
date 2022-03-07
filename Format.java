/* This class is designed to create a format for the final product which will present a nice image
of the six classes and the five timeslots. It uses a 2d ArrayList and for loops to populate and 
print out the format */
import java.util.ArrayList;

public class Format{ 
	public static void main(String[] args){ 
		
		ArrayList<ArrayList<Character>> board = new ArrayList<ArrayList<Character>>();
		
		
		for(int i = 0; i<6; i++) //creates 6 "rooms"
		{
			board.add(new ArrayList<Character>());
			
			for(int x = 0; x < 5; x++){ //creates 5 "timeslots"
				
						board.get(i).add('\u2610'); //adds the box image
				
			}
		}
		
		
		System.out.print("\nSIX ROOMS BY FIVE TIME SLOTS"); //header for the board
		
		
		System.out.println("");
		for(int i = 0; i<board.size(); i++)
		{
			
			
				System.out.println(board.get(i)); //prints out board
		
			
		}
		
		
		
		
		
		
		
		
	}











}
