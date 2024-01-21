import java.util.*;
public class fbintodec {
    public static int btod(int binnum){
        int powr = 0;
        int decnum = 0;
        while( binnum>0){
            int lastdigit = binnum%10;
            decnum += lastdigit*(int)Math.pow(2,powr);
            binnum /=10;
            powr++;
        }
        return decnum;
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number in binary form to convert into decimal: ");
    int binnum = sc.nextInt();
    int decnum = btod(binnum);
    System.out.println("The decimal form of number "+binnum+" is "+ decnum );
    sc.close();

}
}
