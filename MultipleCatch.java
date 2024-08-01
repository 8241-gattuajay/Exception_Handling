import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        try{
            int input1=sc.nextInt();
            int input2=sc.nextInt();
            int result = input1/input2;
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic Exception caught: Division by zero.");
        }

        catch(InputMismatchException e){
            System.out.println("Input Mismatch Exception caught: Please enter an integer.");
        }

        finally {
            System.out.println("This is the finally block.");
        }
    }
}
