//this class is the meat of the program and creates seminars, adds students, and creates the schedule.
import java.util.ArrayList;
public class Schedule{
    ArrayList<Student> students;
    ArrayList<Integer> choiceCounter;
    ArrayList<Integer> rankedChoices;
    ArrayList<ArrayList<ArrayList<Student>>> schedule;
    ArrayList<Integer> unassigned;

    public ArrayList<ArrayList<Integer>> seminars;
    public Schedule() throws Exception{
        //gets the students
        Scrape s = new Scrape();
        students = s.getStudents();
        //counts choice totals
        choiceCounter = new ArrayList<Integer>();
        //ranks choices showing their index
        rankedChoices = new ArrayList<Integer>();
        //list of classes
        seminars = new ArrayList<ArrayList<Integer>>();
        //people who miss out of preffered classes
        unassigned = new ArrayList<Integer>();

    }
    	//counts the number of choices of total students
	public void countChoices(){
	    //counting array
		//add the counter to this instead of variabless
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
        //this is a copy of the choices counted
        ArrayList<Integer> choiceCounter2 = new ArrayList<Integer>();
        for(int i=0;i<choiceCounter.size();i++){
            choiceCounter2.add(choiceCounter.get(i));
        }
        
        //this sequence ranks the classes based on most wanted to least and shows them via their index in rankedChoices
        //by doing so, this allows me to know which classes should be priority and should be spread over multiple time periods
        for(int i = 0; i<choiceCounter2.size();i++){
            int indexOfMost = 0;
            for(int k = 0; k<choiceCounter2.size();k++){
                if(choiceCounter2.get(k) > choiceCounter2.get(indexOfMost)){
                    indexOfMost = k;
                }
            }
            rankedChoices.add(indexOfMost+1);
            choiceCounter2.set(indexOfMost, 0);
           
        }
	}

    //creates the rooms for the classes (30 of them) in order of their wantedness based on rankedChoices
    public void createRooms(){
        for(int i = 0; i<30;i++){
            seminars.add(new ArrayList<Integer>());
            //I used a mod to have the first few classes made again to handle overflow
            seminars.get(i).add(rankedChoices.get(i%18));
        }
	}

    //assigns students to certain seminars based on their preferences 
    public void assignStudents(){
        /*this puts the students in the classes that they want and keeps track of the students that arent able to take the classes they want
        the main idea is that it checks to see if the class is filled up, if not, the student can go to that class, if it is, then it checks to see
        if there is another time slot of the same class, if there isnt, then it adds that student to the unassigned arraylist*/
        for(int m = 0; m<5; m++){
            for(int i = 0; i<students.size(); i++){
                int choice = students.get(i).choice.get(m);
                boolean assigned = false;
                for(int k = 0; k<seminars.size();k++){
                    //checks if its the same choice and if its not filled
                    if(seminars.get(k).get(0) == choice && seminars.get(k).size()<16){
                        seminars.get(k).add(students.get(i).rank);
                        choiceCounter.set(choice-1, choiceCounter.get(choice-1)-1);
                        assigned = true;
                        break;
                    }
                }
                //adds to unassigned array list
                if(!assigned){
                    unassigned.add(students.get(i).rank);
                }

            }
            
        }

        //this assigns the the students who werent able to get in a preferred class to one of the least popular classes
        while(unassigned.size() > 0){
            int student = unassigned.get(0);
            for(int i = 0; i<5; i++){
                boolean taken = false;
                for(int k = 0; k<seminars.get(17-i).size(); i++){
                    //this will check if the student is already in the class, if not, then add them, if so, then check the next least popular class
                    if(student != seminars.get(17-i).get(k) && seminars.get(17-i).size() < 16){
                        seminars.get(17-i).add(student);
                        unassigned.remove(0);
                        taken = true;
                        break;
                    }
                }
                if(taken){
                    break;
                }
            }
        }
        System.out.println("\n This is the schedule not formatted: \n" + seminars);
    }
}
