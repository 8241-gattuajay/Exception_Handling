import java.util.Scanner;

public class TryandCatch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        try{
           int sum=100/a;
        }
        catch(ArithmeticException e){
            System.out.println("Exception caught: Division by zero.");
        }
    }
}
