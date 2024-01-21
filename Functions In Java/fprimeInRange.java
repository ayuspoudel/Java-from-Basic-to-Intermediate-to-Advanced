import java.util.*;
public class fprimeInRange {
    public static boolean isprime(int n){
        boolean isprimevar = true;
        if (n == 2){
            isprimevar = true;
        }
        else{
            for (int i = 2; i<= Math.sqrt(n); i++){
                if (n%i == 0){
                    isprimevar = false;
                    break;
                }
            }
        }
    return isprimevar;
    }  

    public static void primeInrange(int n){
        for (int i = 2; i<=n; i++){
            if (isprime(i)){
                System.out.print(i+" ");
            }
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range of prime numbers you want: ");
        int userrange = sc.nextInt();
        primeInrange(userrange);
        sc.close();
    }


}   
