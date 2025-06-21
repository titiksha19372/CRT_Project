public class Array_revesed {
    public static void revesed(int numbers[])
    {
int first=0, last=numbers.length-1;
while(first<last){
    int temp=numbers[last];
    numbers[last]=numbers[first];
    numbers[first]=temp;
    first++;
    last--;
}
    }
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 6, 89, 7, 6, 4, 3};
        System.out.print("The array is: ");
         for (int i = 0; i < numbers.length; i++) {
        System.out.print(numbers[i] + " ");
        }
        System.out.println();
        revesed(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
