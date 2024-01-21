public class ptnhollowrhombus {
    public static void hollowrhombus(int size){
        for (int i=size; i>0;i--){
            for (int j = 1; j<=i; j++){
                System.out.print(" ");
            }
            for (int k = 1; k<=size; k++){
                if(i ==1 || k == 1 || i==size || k == size){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollowrhombus(5);
    }
}
