import java.util.Scanner;

public class CustomUncheckedException {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a integer: ");
        int number = sc.nextInt();
        try{
            if(number<0){
                throw new NegativeNumberException("Negative number not allowed");
            }
            else{
                System.out.println("Number is positive");
            }
        }
        catch(NegativeNumberException e){
            System.out.println("Exception caught: "+e);
        }
    }

    public static class NegativeNumberException extends RuntimeException {
        public NegativeNumberException(String message) {
            super(message);
        }
    }

}
