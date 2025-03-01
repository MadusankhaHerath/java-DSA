import java.util.NoSuchElementException;

class sampleCQ2 {
    private Node rear;
    private int size;
    
    private static class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
        }
    }
    
    public sampleCQ2() {
        rear = null;
        size = 0;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            rear = newNode;
            rear.next = rear;
        } else {
            newNode.next = rear.next;
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }
    
    public int dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        Node front = rear.next;
        int value = front.data;
        if (rear == front) {
            rear = null;
        } else {
            rear.next = front.next;
        }
        size--;
        return value;
    }
    
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue: ");
        Node current = rear.next;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != rear.next);
        System.out.println();
    }
    
    public static void main(String[] args) {
        sampleCQ2 cq = new sampleCQ2();
        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.display();
        
        System.out.println("Dequeued: " + cq.dequeue());
        cq.display();
        
        cq.enqueue(40);
        cq.display();
    }
}
