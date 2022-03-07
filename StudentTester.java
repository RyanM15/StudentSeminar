
import java.util.ArrayList;

public class StudentTester{
	
	public static void main(String[] args)
	{
		ArrayList<Integer> choice2 = new ArrayList<Integer>();
		choice2.add(1);
		choice2.add(3);
		choice2.add(5);
		choice2.add(2);
		choice2.add(4);
		Student s1 = new Student("meadorya23@7hills.org", "Ryan Meador", choice2, 3);
		System.out.println(s1);
	}




}
