import java.util.*;
public class linearSearch{
    public static void search(){
        Scanner sc = new Scanner (System.in);
    System.out.println("Enter the size of the array:");
    int n = sc.nextInt();
    int a[] = new int[n];
    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < n; i++) {
        a[i] = sc.nextInt();
    }
    System.out.println("Enter the element to be searched:");
    int key = sc.nextInt();
    for (int i = 0; i < n; i++) {
        if (a[i] == key) {
            System.out.println("Element found at index: " + i);
            // break;
            return;
        }
        // else {
        //     System.out.println("Element not found at index: " + i);
        // }
    }
    System.out.println("Element not found");

sc.close();
    }
public static void main(String[] args) {
    search();
    
}
} 