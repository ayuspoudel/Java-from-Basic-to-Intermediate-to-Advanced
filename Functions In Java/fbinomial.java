import java.util.*;
public class fbinomial {
    public static int factorial(int num1 ){
        int temp = 1;
        for (int i=num1; i>0; i--){
            temp*=i;
        }
        return temp;
        }
    public static int binomial(int num1, int num2){
        int temp = num1-num2;
        int binCoeff = factorial(num1) / (factorial(num2)*factorial(temp));
        return binCoeff;
    }
    public static void main(String[] args) {
    System.out.println(("Please enter n then r for binomial coefficient calculation: "));
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int r = sc.nextInt();
    int binCoeff = binomial(n,r);
    System.out.println("The binomial coefficient of given numbers is: "+binCoeff);    
    sc.close();
    
    }
    

}
