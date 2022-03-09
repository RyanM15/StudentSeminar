import java.io.*;  
import java.util.Scanner;  
import java.util.ArrayList;
import java.io.FileNotFoundException;
//this is the Scape Class which uses a scanner to scrape the SemData.csv file and parse the info
public class Scrape{
	public static void main(String args[]) throws Exception{
		//init scanner
		Scanner sc = new Scanner(new File("SemData.csv"));  
		//uses both the , and \n as delim
		sc.useDelimiter(",|\n");    
		int counter = 0;
		//info holder
		String email = "";
		String name = "";
		int rank = 0;
		ArrayList<Integer> choice = new ArrayList<Integer>();
		
		//while loop that goes through each person
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
					//System.out.println("Choices: " + choice);
					//make a student class
					Student s = new Student(email, name, choice, rank);
					System.out.println(s.toString());
					//delete values of array list to restart
					for(int i = 0; i<5;i++){
						choice.remove(0);
					}
					//restart the counter for new line
					counter = 0;
					break;
			}
			
			
		}
/*
12/5/2018 13:36
WadeEdg@myschool.com
Edgar
Wade
1
2
16
15
9
*/
		
		sc.close();  //closes the scanner  
	}
	

	
	
}

