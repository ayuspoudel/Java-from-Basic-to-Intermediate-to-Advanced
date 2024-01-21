import java.util.*;
public class ptnfloydstrgn {
    public static void floydstriangle(int num){
        int temp = 1;
        int j = 1;
        while (temp<=num){
            int i = 1;
            while (i<=temp){
                System.out.print(j);
                i++;
                j++;
            }
            System.out.println();
            temp++;
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter the size of floyd's triangle: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        floydstriangle(num);
        sc.close();
        
    }
}
