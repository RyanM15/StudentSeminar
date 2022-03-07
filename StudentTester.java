/* This is just a tester class for figuring out the correct syntax for adding an ArrayList into a constructor 
 * to be able to be printed out and used later*/
import java.util.ArrayList;

public class StudentTester{
	
	public static void main(String[] args)
	{
		ArrayList<Integer> choice2 = new ArrayList<Integer>();
		//adds example choices to the choice array to make sure it will work when using the real values
		choice2.add(1);  
		choice2.add(3);
		choice2.add(5);
		choice2.add(2);
		choice2.add(4);
		Student s1 = new Student("meadorya23@7hills.org", "Ryan Meador", choice2, 3); //creates an example of a student with all needed info
		System.out.println(s1);
	}




}
