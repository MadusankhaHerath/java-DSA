class sampleRQ {
    private int[] queue;
    private int front, rear, size, capacity;

    public sampleRQ(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = rear = -1;
        size = 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % capacity;
        }
        queue[rear] = value;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int removedValue = queue[front];
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % capacity;
        }
        size--;
        return removedValue;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue: ");
        for (int i = 0, index = front; i < size; i++) {
            System.out.print(queue[index] + " ");
            index = (index + 1) % capacity;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        sampleRQ cq = new sampleRQ(5);
        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);
        cq.enqueue(50);
        cq.display();
        
        System.out.println("Dequeued: " + cq.dequeue());
        cq.display();
        
        cq.enqueue(60);
        cq.display();
    }
}
