import java.util.Scanner;
public class typecasting {
    public static void main(String args[]){
        /* This block of code converts float into integer */
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a floating point number: ");
        float a = sc.nextFloat();
        int b = (int) a;
        System.out.print("Your floating point number is an integer now which is, ");
        System.out.print(b);
        sc.close();


    }    
}
