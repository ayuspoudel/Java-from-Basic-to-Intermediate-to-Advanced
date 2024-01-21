import java.util.Scanner;

public class ptn01triangle_boolonoffmethod {
    public static boolean boolonoff(boolean flag){
        boolean result = !(flag);
        return result;
    }
    public static void triangle01(int num){
        boolean flag = true;
        for (int i = 0; i<num; i++){
            for(int j = 0; j<=i; j++){
                if(flag == true){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
                flag = !(flag);
            }
            System.out.println();

        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the triangle to print: ");
        int num = sc.nextInt();
        triangle01(num);
        sc.close();
    }
}
