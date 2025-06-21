public class Queue {
    private int[] arr;
    private int front;
    private int rear;
    private int size;

    public Queue(int size) {
        this.arr = new int[size];
        this.front = -1;
        this.rear = -1;
        this.size = size;
    }

    public boolean isEmpty() {
        return front == -1 || front > rear;
    }

    public boolean isFull() {
        return rear == size - 1;
    }

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("The queue is full");
            return;
        }

        if (isEmpty()) {
            front = 0;
        }

        rear++;
        arr[rear] = data;
        System.out.println("Enqueued: " + data);
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("The queue is empty");
            return;
        }

        System.out.println("Dequeued: " + arr[front]);
        front++;

        if (front > rear) {
            front = rear = -1;
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("The queue is empty");
            return;
        }

        System.out.print("Queue elements: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public int peek() {
    if (isEmpty()) {
        System.out.println("The queue is empty");
        return -1;
    } else {
        return arr[front];
    }
}


    public static void main(String[] args) {
        Queue q = new Queue(10);
        for (int i = 1; i < 11; i++) {
            q.enqueue(i);
        }

        q.display();

        q.dequeue();
        q.display();
        System.out.println("Front element is: " + q.peek());

    }
}
