public class KadanesAlgorithm {
    public static void kadanes(int num[]){
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i<num.length; i++){     
            curr_sum += num[i];
            if (curr_sum <0){
                curr_sum = 0;
            }

            if (max_sum<curr_sum){
                max_sum = curr_sum;
            }
        }
        System.out.println("The maximum sum is "+max_sum);

    }

    public static void main(String[] args) {
        int num[] = {-2,-3,4,-1,-2,1,5,-3};
        kadanes(num);
    }
}
