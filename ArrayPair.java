public class ArrayPair{
    public static void pair(int[] numbers) {
        int total_pair=0;
        for (int i = 0; i < numbers.length; i++) {
            int current = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + current + "," + numbers[j] + ") ");
                total_pair++;
            }
            System.out.println();
        }
        System.out.println("the total pair are"+total_pair);
    }

    public static void main(String args[]) {
        int numbers[] = {2,4,6,8,10};
        pair(numbers);
    }
}
