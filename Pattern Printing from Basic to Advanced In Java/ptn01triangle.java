import java.util.*;
public class ptn01triangle {
    public static void triangle01(int num){
        for (int row = 1; row<=num; row++){
            for (int col = 1; col<=row; col++){
                if ((row + col)%2 == 0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
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
