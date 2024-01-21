import java.util.*;
public class ptnhalfpyrinvtd {
    public static void invdpyr(int num){
        for (int i=num;i>=1;i--){
            for (int j= i; j>=1; j-- ){
                System.out.print(j+ " ");
            }            
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the size of the triangle you want to print");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        invdpyr(num);
        sc.close();
    }
}
