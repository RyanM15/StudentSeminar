import java.io.*;  
import java.util.Scanner;  
import java.util.ArrayList;
import java.io.FileNotFoundException;
//this is the Scape Class which uses a scanner to scrape the SemData.csv file and parse the info
public class Scrape{
	ArrayList<Student> students = new ArrayList<Student>();
	public Scrape() throws Exception{
		//init scanner
		Scanner sc = new Scanner(new File("Data1.csv"));  
		//uses both the , and \n as delim
		sc.useDelimiter(",");    
		int counter = 0;
		//info holder
		String email = "";
		String name = "";
		int rank = 0;
		//while loop that goes through each person
		ArrayList<Integer> choice = new ArrayList<Integer>();
		while(sc.hasNext()){
			counter++;
			
			//each line has certain info at each comma so this parses it based on what comma it is on
			switch(counter){
				case 1:
					sc.next();
					rank++;
					//System.out.println("Rank: " + rank);
					break;
				case 2:
					email = sc.next();
					//System.out.println("Email: " + email);
					break;
				case 3:
					name = sc.next();
					break;
				case 4:
					name = name + " " + sc.next();
					//System.out.println("Name: " + name);
					break;
					
				case 5:
					choice.add(Integer.parseInt(sc.next()));
					//System.out.println("Choices: " + choice);
					break;
				case 6:
					choice.add(Integer.parseInt(sc.next()));
					//System.out.println("Choices: " + choice);
					break;
				case 7:
					choice.add(Integer.parseInt(sc.next()));
					//System.out.println("Choices: " + choice);
					break;
				case 8:
					choice.add(Integer.parseInt(sc.next()));
					//System.out.println("Choices: " + choice);
					break;
				case 9:
				//i used to have to account for \r but instead i formatted the csv differently
					choice.add(Integer.parseInt(sc.next()));
					
					//make a student class
					Student s = new Student(email, name, choice, rank);
					//System.out.println(s);
					students.add(s);
					
					//delete values of array list to restart
					choice = new ArrayList<Integer>();
				
					//restart the counter for new line
					counter = 0;
					break;
			}
		}
		sc.close();  //closes the scanner  
	}

    public ArrayList<Student> getStudents(){
        return students;
    }
}
