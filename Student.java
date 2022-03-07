/* This class creates the student constructor to accept all needed info about the students
 * and their choices from the scraped excell sheet*/
import java.util.ArrayList;

public class Student{
	
	//assigns all needed variable for student info
	public String email;
	public String name; 
	public int minute;
	ArrayList<Integer> choice = new ArrayList<Integer>(); //creates an ArrayList to add the choices to
	
	public Student(String email, String name, ArrayList<Integer> choice, int minute){
		this.email = email;
		this.name = name;
		this.choice = choice;
		this.minute = minute;
	}
	
	public String toString(){ //allows variables to be printed
		return ("email: " + email + ", name: " + name + ", choices: " + choice + ", minute: " + minute); 
		
	}










}
