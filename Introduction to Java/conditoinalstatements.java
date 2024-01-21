import java.util.Scanner;
public class conditoinalstatements {
    public static void main(String args[]){
        System.out.print("Please enter your age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age<18){
            System.out.print("You are not an adult");
        }
        else if (age>=18 && age<=48){
            System.out.println("you are an adult");
        }
        else{
            System.out.println("You are an elderly peron");
        }
        sc.close();

    }
    
}
