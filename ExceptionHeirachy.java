import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHeirachy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value: ");


        try{
            //int value = sc.nextInt();
            String str=null;
           // int result = 100/value;
            if(str.equals("abc")){
                System.out.println("Equal");
            }else{
                System.out.println("Not equal");
            }

        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic Exception caught: Division by zero.");
        }
        catch (NullPointerException e){
            System.out.println("Exception caught: Null pointer exception.");
        }
        catch (InputMismatchException e){
            System.out.println("Exception caught: Input mismatch exception. Please enter an integer.");
        }
        finally {
            System.out.println("This is the finally block.");
        }
    }
}
