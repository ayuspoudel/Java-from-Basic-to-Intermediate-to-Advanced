import java.util.*;
public class fproduct {
    public static float product(float num1, float num2){
        float prod =  num1*num2;
        return prod;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       float a = sc.nextFloat();
       float b = sc.nextFloat(); 
       float produ =  product(a,b);
       System.out.println("The product of numbers " + a+ " and "+b+ "is "+produ);
        sc.close();
    }
}
