import java.util.Scanner ;
public class productwithInput {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a real number: ");
        float a = sc.nextFloat();
        System.out.print("Please enter another real number:");
        float b = sc.nextFloat();
        float prod = a * b;
        System.out.print("The sum of two numbers are: ");
        System.out.print(prod);
        sc.close();

    }

    
}
