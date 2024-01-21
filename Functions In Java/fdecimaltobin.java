import java.util.*;
public class fdecimaltobin {
    public static int dtob(int decnum){
        int x = 0;
        int binnum = 0;
        while (decnum>0){
            int lastdigit = decnum%2;
            binnum += lastdigit * (int)Math.pow(10,x);
            decnum /= 2;
            x++;
        }
        return binnum;
    }
    public static void main(String[] args) {
        System.out.print("Enter a decimal number to convert into binary: ");
        Scanner sc = new Scanner(System.in);
        int decnum = sc.nextInt();
        sc.close();
        int binnum = dtob(decnum);
        System.out.println("The binary form of "+decnum+" is "+binnum);
        
    }
}
