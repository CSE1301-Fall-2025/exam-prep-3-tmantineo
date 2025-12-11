package exam.codewriting.q1;
import java.util.HashMap;
import java.util.LinkedList;
public class Dormitory
{	private String name ;
	private HashMap < String , Student > rooms ;
	public Dormitory(String name) {
		this.name = name;
		this.rooms = new HashMap<>();
	}
	public String getName () {
		return name; //FIXME
	}
	public int getOccupiedRooms () {
		return rooms.size();//FIXME
	}
	public void addStudent ( String roomNo , Student s) {
		rooms.put(roomNo, s); //FIXME
	}
	public boolean isOccupied ( String roomNo) {
		return rooms.containsKey(roomNo); //FIXME
	}
	public LinkedList < Integer > getStudentIds () {
	    LinkedList<Integer> ids = new LinkedList<>();

		for (Student s : rooms.values()) {
            ids.add(s.getId()); 
        }
        return ids;
	}
	public static void main(String[] args) {
		 // Create a Dormitory object

    // Create a Student object

    // Add the student to a room

    // Check if student ID 123456 exists

	}
}
