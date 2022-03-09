import java.util.ArrayList;

public class Student{
	//assigns all needed variable for student info
	public String email;
	public String name; 
	public int rank;
	ArrayList<Integer> choice = new ArrayList<Integer>(); //creates an ArrayList to add the choices to
	
	public Student(String email, String name, ArrayList<Integer> choice, int rank){
		this.email = email;
		this.name = name;
		this.choice = choice;
		this.rank = rank;
	}
	
	public String toString(){ //allows variables to be printed
		return ("email: " + email + ", name: " + name + ", choices: " + choice + ", rank: " + rank); 
	}
}
