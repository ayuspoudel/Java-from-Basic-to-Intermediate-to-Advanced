public class ptndiamond {
    public static void diamond(int size){
        for (int i = size; i>0; i--){
            /*The logic here to print is
             * Inverted triangle with white space
             * A triangle with */
            for (int j = 1; j<i; j++){
                System.out.print(" ");
            }
            for (int j = i; j<=size; j++){
                System.out.print("*");
            }
            for (int j = i; j<size; j++){
                System.out.print("*");
            }
            System.out.println();
            }
        
        for (int i = 1; i<size; i++){
            for (int k = 1; k<=i; k++){
            System.out.print(" ");
            }
            for (int k = size; k>i; k--){
                System.out.print("*");
            }
            for (int j = (i+1); j<size; j++){
                System.out.print("*");
            }
            System.out.println();
        }
            
        }
    public static void main(String args[]){
        diamond(5);
    }
}
