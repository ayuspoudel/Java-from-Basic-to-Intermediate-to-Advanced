public class ptnbutterfly {
    public static void butterfly(int num){
    //First half
        for (int i = 1; i<=(num/2); i++){
        /* The logic is to print 
         * star = 1 time
         * white space = n-2 time
         * star = 1 time
         */
        for (int j = 1; j<= i; j++){
            System.out.print("*");
        }
        for (int j = 1; j<= (num -2*i); j++){
            System.out.print(" ");
        }
        for (int j = 1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
    //Second half
        for(int i=num/2; i>=1; i--){
            for (int  j = 1; j<=i; j++){
                System.out.print("*");
            }
            for(int j =1 ; j<= num - 2*i; j++){
                System.out.print(" ");
            }
            for (int j =1 ; j<= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        butterfly(20);
    }
}
