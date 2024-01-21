import java.util.*;
public class ffactorial {
    public static int factorial(int n){
        int temp = 1;
        for (int i = n; i>0; i--){
            temp*=i;
        }
        return temp;
    }
    public static void main(String[] args) {
        System.out.print("Enter a number to calculate the factorial of: ");
        Scanner sc = new Scanner(System.in);
        int fac = sc.nextInt();
        sc.close();
        int result = factorial(fac);
        System.out.println("The factorial of "+fac+"is "+result);
        
    }
}
