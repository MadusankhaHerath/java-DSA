public class cqueue{
    int front;
    int rear;;
    int capacity;

    int arr[];

    cqueue(int size){
        front = -1;
        rear = -1;
        capacity = size;

        arr = new int[size];
    
    }

    boolean isempty(){
        if(front == -1){
            return true;
        }
        else{
            return false;
        }

    }

    boolean isfull(){
        if(front == 0 && rear == capacity - 1)
            return true;
        else if (rear == front -1) {
            return true;    
        }
        else{
            return false;
        }
    }

    void enqueue(int ele){
        if(isfull()){
            System.out.println("queue is full");
        }
        else{
            if(front == -1){
                front=0;
            }
                rear =(rear + 1) % capacity;
                arr [rear] = ele;

                System.out.println("entering : " + ele);
            
        }
    }

    int dequeue(){

        int element=0;

        if (isempty()){
            System.out.println("queue is empty");
        }
        else{
           element = arr[front];

           if(front == rear){ 
            front = -1;
            rear = -1;
           }
           else{
            front = (front + 1) % capacity;
           }
           System.out.println("deleting : "+element);

        }
        return element;
    }

    void display(){
        int i;

        if (isempty()){
            System.out.println("queue is empty");
        }
        else{
            System.out.print("Queue is : ");

        for( i=front;i!=rear;i = (i+1)% capacity){
            System.out.print(arr[i] + " ");
        }
         System.out.println(arr[i]);
        }

        
    }

    public static void main(String [] arg){
        cqueue c1 = new cqueue(4);

        c1.enqueue(10);
        c1.enqueue(20);
        c1.enqueue(30);
        c1.enqueue(40);
        c1.enqueue(50);

        c1.display();

        c1.dequeue();
        c1.dequeue();

        c1.display();

        c1.enqueue(10);

        c1.display();

    }



}
