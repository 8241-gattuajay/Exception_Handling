public class BankingSystem{
       private double balance;
    public BankingSystem(double balance){
        this.balance=balance;
    }

    public void deposit(double amount){
        System.out.println("Deposited: "+amount);
        balance+=amount;
    }

    public void withdraw(double amount ) throws InsufficientFundsException{
        if(amount< balance){
            System.out.println("Withdrawn: "+amount);
            balance-=amount;
        }
        else{
            throw new InsufficientFundsException((int)amount);
        }

    }

    public static void main(String[] args) {
        BankingSystem account=new BankingSystem(1000);
        account.deposit(500);
        try{
            account.withdraw(2000);
        }
        catch(InsufficientFundsException e){
            System.out.println("Exception caught: "+e);
        }
    }
}