
import java.util.*;
public class Array{
    public static void main(String[] args) {
        int marks[] = new int[50];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int n = sc.nextInt();
        System.out.println("Enter the marks of the students:");
        for(int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }
        System.out.println("The marks of the students are:");
        for(int i = 0; i < n; i++) {
            System.out.print(marks[i] + " ");
        }
    }
}