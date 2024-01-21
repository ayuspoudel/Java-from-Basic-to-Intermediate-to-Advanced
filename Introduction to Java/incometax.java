import java.util.Scanner;
public class incometax {
    /**
     * @param Args
     */
    public static void main(String Args[]){
        System.out.print("Enter your annual income: ");
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        System.out.print("The income tax that you need to pay is: ");
        if (income>1000000){
            int tax = (income * 30)/100;
            System.out.println(tax);
        }
        else if (income>=500000 && income<=1000000){
            int tax = (income*20)/100;
            System.out.println(tax);
            }
        else{
            System.out.print("0");
            }
        sc.close();
        }
    }
