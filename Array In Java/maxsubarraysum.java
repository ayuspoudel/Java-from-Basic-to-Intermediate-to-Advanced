public class maxsubarraysum {
    public static int maxsum(int num[]){
        int max_sum = 0;
        
        for (int i =0; i<num.length; i++){
            int start = i;
            for (int j = i; j< num.length; j++){
                int end = j;
                int sum = 0;
                for ( int k = start; k<=end; k++){
                    sum+= num[k];
                    }
                if (sum>max_sum){
                    max_sum = sum;
                    }
                }
            }
        return max_sum;
        }
    public static void main(String[] args) {
          int array1[] = {1,2,3,4,5};
          int max =  maxsum(array1);
          System.out.println(max);
        }

    }

