public class ptnsolidrhombus {
    public static void rhombus1(int size){

        for (int i=size; i>0;i--){
            /* The logic here is to print 
             * stars - size amount (always)
             * white space in the begining from size -1  to 0 times
             */
            for(int j = 0; j<i; j++){
                System.out.print(" ");
            }
            for (int j = 0; j<size; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        rhombus1(5)
        ;
    }

}
