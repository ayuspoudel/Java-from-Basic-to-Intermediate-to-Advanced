import java.util.*;
public class fisprime {
    public static boolean isprime(int n){
        boolean isprimevar = true;
        if (n == 2){
            isprimevar = true ; 
        }
        else{
            for (int i = 2; i <= Math.sqrt(n); i++){
                if (n%i == 0){
                    isprimevar = false;
                    break;
                }
            }
        }
        return isprimevar;
    }

    public static void main(String[] args) {
        System.out.print("Enter a number to check if prime or not: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (isprime(num)){
            System.out.println(num+" is a prime number");
        }
        else{
            System.out.println(num+" is not a prime number");
        }
        sc.close();
    }
}
