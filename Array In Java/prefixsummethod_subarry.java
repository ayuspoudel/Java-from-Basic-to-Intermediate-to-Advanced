public class prefixsummethod_subarry {
    public static int prefixarray(int num[]){
        int prefix[] = new int[num.length];
        int sum = num[0];
        for (int i = 1; i<num.length; i++){
            sum+=num[i];
            prefix[i]=sum;
        }
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i<num.length; i++){
            int start = i;
            for (int j = i; j< num.length; j++){
                int end = j;
                int curr_sum = start == 0? prefix[end]: prefix[end] - prefix[start-1];
                if (max_sum<curr_sum){
                    max_sum = curr_sum;
                }

            }
        }
        return max_sum;
        
    }
    public static void main(String[] args) {
        int num[] = {1,-2,6,-1,3};
        int max = prefixarray(num);
            System.out.print(max);

        }
        
    }

