import java.util.Scanner;
public class Ternaryoperator {
    public static void main(String args[]){
        System.out.print("Enter a number to scheck if even or odd: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        String type = (input%2 == 0)?"even":"odd";
        System.out.println(type);
        sc.close();
    }
}
