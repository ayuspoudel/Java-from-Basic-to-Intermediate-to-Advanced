import java.util.*;
public class reverseofnum {
    public static void main(String[] args) {
        System.out.println("Plese enter a number to reverse");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev = 0;
        while (num>0){
            int last_dig = num%10;
            rev = (rev*10) + last_dig;
            num /= 10;
            
        }
        System.out.print(rev);
        sc.close();
    }
}
