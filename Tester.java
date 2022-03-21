//generic tester that shows UI and call and creates Schedule
import java.util.Scanner;  
import java.util.ArrayList;
public class Tester{
    public static void main(String args[]) throws Exception{
        Schedule s = new Schedule();
        //this scrape and student class is just here so i can compile it if i make changes
        Scrape compile = new Scrape();
        Student compile1 = new Student("fake", "fake", new ArrayList<Integer>(), 0);
        
        //assign students and make schedule
        s.countChoices();
        s.createRooms();
        s.assignStudents();
        s.makeSchedule();

        //start of UI experiences
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello. The students have all been assigned to their seminars and");
        System.out.println("seminars have been placed in valid timeslots\n");
        System.out.print("\nPress Enter to Continue: \n");
        sc.nextLine();
        System.out.println("This is the schedule with the numbers corresponding to a seminar (laid out by the OG spread sheet):");
        System.out.println("*-1 represents an empty seminar in the schedule*\n");
        s.printSchedule();//prints schedule
        System.out.print("\nPress Enter to Continue: \n");
        sc.nextLine();
        System.out.println("This is a list of all seminars in order listed on schedule with Student IDs in them:\n");
        s.showSeminars();//shows list of seminars
    }
}
