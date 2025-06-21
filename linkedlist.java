//package DSA_java;
public class linkedlist {
    int data;
    linkedlist next;

    
    static linkedlist head = null;

   
    linkedlist(int data) {
        this.data = data;
        this.next = null;
    }

    
    public static void insert(int data) {
        linkedlist newNode = new linkedlist(data);
        if (head == null) {
            head = newNode;
        } else {
            linkedlist current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public static void insertback(int data) {
    linkedlist newNode = new linkedlist(data);
    
    if (head == null) {
        head = newNode;
    } else {
        linkedlist current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
}
   public static void insertatany(int data, int index)
   { 
        linkedlist newNode = new linkedlist(data);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        linkedlist current = head;
        for (int i = 0; i < index - 1 && current != null; i++) {
            current = current.next;
        }
        if (current != null) {
            newNode.next = current.next;
            current.next = newNode;
        } else {
            System.out.println("Index out of bounds");
        }
   }
    public static void count() {
        int count = 0;
        linkedlist current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        System.out.println("count is " + count);
    }
   
   
    public static void insertFront(int data) {
        linkedlist newNode = new linkedlist(data);
        newNode.next = head;
        head = newNode;
    }
    public static void delete(){
        if(head==null){
            System.out.println("list is empty");
        }else{
            
        }
    }


    public static void printlist() {
        linkedlist current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        insert(2);
        insert(3);
        insert(4);
        printlist();
        insertFront(1);
        insert(5);
        printlist();
        insertback(56);
        printlist();
        insertatany(10, 2);
        printlist();
        count();
    }
}
