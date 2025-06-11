import java.util.*;

public class first2D_array {
    public static void main(String[] args) {
        int a[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array elements:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("The array elements are:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum += a[i][j];
            }
        }
        System.out.println("The sum of the array elements is: " + sum);

        int min = a[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (a[i][j] < min) {
                    min = a[i][j];
                }
            }
        }
        System.out.println("The minimum element in the array is: " + min);

        int rowsum[] = new int[3];
        for (int i = 0; i < 3; i++) {
            rowsum[i] = 0;
            for (int j = 0; j < 3; j++) {
                rowsum[i] += a[i][j];
            }
        }

        System.out.println("The sum of each row is:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Row " + (i + 1) + ": " + rowsum[i]);
        }
        int colsum[]=new int[3];
        for (int j = 0; j < 3; j++) {   
            colsum[j] = 0;
            for (int i = 0; i < 3; i++) {
                colsum[j] += a[i][j];
            }
        }
        System.out.println("The sum of each column is:");
        for (int j = 0; j < 3; j++) {
            System.out.println("Column " + (j + 1) + ": " + colsum[j]);
        }
       for(int i=2; i>=0; i--) {
            for(int j=2; j>=0; j--) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        int transpose[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpose[j][i] = a[i][j];
            }
        }
        System.out.println("The transpose of the array is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(transpose[i][j] + " ");
            }
        }   

       for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                System.out.print(a[i][2-i] + " ");
            }
        }
}
}
