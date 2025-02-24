import java.util.Stack;

public class sampleS {
    public static void main(String[] args) {
        // Creating a Stack
        Stack<String> crewStack = new Stack<>();

        // Pushing elements onto the Stack
        crewStack.push("Alice");
        crewStack.push("Bob");
        crewStack.push("Charlie");
        crewStack.push("David");

        // Displaying the Stack
        System.out.println("Crew Stack: " + crewStack);

        // Popping an element from the Stack (LIFO)
        String lastAdded = crewStack.pop(); // Removes and returns the top element
        System.out.println("Removed Crew: " + lastAdded);

        // Displaying the Stack after removal
        System.out.println("Updated Crew Stack: " + crewStack);
    }
}
