import java.util.LinkedList;
import java.util.Queue;

public class sampleQ {
    public static void main(String[] args) {
        // Creating a Queue
        Queue<String> crewQueue = new LinkedList<>();

        // Adding elements to the Queue
        crewQueue.add("Alice");
        crewQueue.add("Bob");
        crewQueue.add("Charlie");
        crewQueue.add("David");

        // Displaying the Queue
        System.out.println("Crew Queue: " + crewQueue);

        // Removing an element from the Queue (FIFO)
        String assignedCrew = crewQueue.poll(); // Removes and returns the head of the queue
        System.out.println("Assigned Crew: " + assignedCrew);

        // Displaying the Queue after removal
        System.out.println("Updated Crew Queue: " + crewQueue);
    }
}
