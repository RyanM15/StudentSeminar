//generic tester and basic UI will be added
import java.util.ArrayList;
public class Tester{
    public static void main(String args[]) throws Exception{
        Schedule s = new Schedule();
        //this scrape is just here so i can compile it if i make changes
        Scrape s1 = new Scrape();
        s.countChoices();
        s.createRooms();
        s.assignStudents();
    }
}
