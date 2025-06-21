public class SubArray {
    public static void printsub(int numbers[]) {
        int current_sum=0;
        int maxSum=Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                current_sum=0;
                for (int k = start; k <= end; k++) {
                    // System.out.print(numbers[k] + " ");   //printing sub array
                    current_sum+=numbers[k];
                }
                System.out.print(current_sum);
                if(maxSum<current_sum){
                    maxSum=current_sum;
                }
                System.out.println();
            }
             System.out.println();
        }
        System.err.println();
        System.out.println("Max sum" +maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = {1,-2,6,-1,3};
        printsub(numbers);
    }
}
