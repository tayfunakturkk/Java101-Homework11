package Functions.Homework1;
import java.util.Scanner;
public class FunctionsHomework1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number to be exponentiated:");
        int n=input.nextInt();
        System.out.print("Enter the number with the exponent:");
        int k=input.nextInt();
        System.out.println("Result:" +exponentiation(n,k));
    }
    static int exponentiation (int n,int k){
        if(k==0){
            return 1;
        }
        else return n*exponentiation(n,k-1);
    }
}
