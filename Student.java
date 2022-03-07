
import java.util.ArrayList;

public class Student{
	
	public String email;
	public String name; 
	public int minute;
	ArrayList<Integer> choice = new ArrayList<Integer>();
	
	public Student(String email, String name, ArrayList<Integer> choice, int minute){
		this.email = email;
		this.name = name;
		this.choice = choice;
		this.minute = minute;
	}
	
	public String toString(){ 
		return ("email: " + email + ", name: " + name + ", choices: " + choice + ", minute: " + minute); 
		
	}










}
