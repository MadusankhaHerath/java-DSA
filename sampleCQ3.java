import java.util.LinkedList;
import java.util.Queue;

class sampleCQ3 {
    private Queue<Integer> queue;
    private int capacity;

    public sampleCQ3(int capacity) {
        this.capacity = capacity;
        this.queue = new LinkedList<>();
    }

    public boolean isFull() {
        return queue.size() == capacity;
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        queue.offer(value);
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue.poll();
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Queue: " + queue);
    }

    public static void main(String[] args) {
        sampleCQ3 cq = new sampleCQ3(5);
        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.display();
        
        System.out.println("Dequeued: " + cq.dequeue());
        cq.display();
        
        cq.enqueue(40);
        cq.enqueue(50);
        cq.enqueue(60);
        cq.display();
    }
}
