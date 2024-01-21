import java.util.*;
public class ptnhalfpyr {
    public static void halfpyramid(int n){
        
        for (int i=1; i<=n; i++){
            for(int j=1; j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){

        System.out.print("Enter the size of the triangular pattern: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        halfpyramid(num);
        sc.close();
    }
}

