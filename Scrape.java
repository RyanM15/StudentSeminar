import java.io.*;  
import java.util.Scanner;  
import java.util.ArrayList;
import java.io.FileNotFoundException;
//this is the Scape Class which uses a scanner to scrape the SemData.csv file and parse the info
public class Scrape{
	ArrayList<Student> students = new ArrayList<Student>();
	public Scrape() throws Exception{
		//init scanner
		Scanner sc = new Scanner(new File("SemData.csv"));  
		//uses both the , and \n as delim
		sc.useDelimiter(",|\n");    
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
				//the last number has a mystery /r on it so i take only the first char
					choice.add(Integer.parseInt(sc.next().substring(0, 1)));
					
					//make a student class
					Student s = new Student(email, name, choice, rank);
					
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
	
	
	public void choice2(){
	
	//counting array
		ArrayList<Integer> choiceCounter = new ArrayList<Integer>();//add the counter to this instead of variabless
		int tempchoiceCount = 0;
		//counted the choices
		for (int i = 0; i < 18; i++)
		{
			choiceCounter.add(0);
		}
		for (int j = 0; j < students.size(); j++)
		{
			for(int i = 1; i <= 18; i++)
			{
				//assigns coutns eahc choice for each class
				if (students.get(j).choice.get(0) == i || students.get(j).choice.get(1) == i || students.get(j).choice.get(2) == i || students.get(j).choice.get(3) == i || students.get(j).choice.get(4) == i)
				{
					tempchoiceCount = choiceCounter.get(i - 1);
					choiceCounter.set(i - 1, tempchoiceCount+1);
					//need to figure out a way to add to the right counter
				}
			
			}
		}	
		System.out.print(choiceCounter);
	}

	
	
}

