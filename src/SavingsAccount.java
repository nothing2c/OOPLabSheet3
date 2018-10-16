public class SavingsAccount extends BankAccount {
    private double balance;

    public SavingsAccount(){
        this("No Name",0,0);
    }

    public SavingsAccount(String name, int accnum, double balance){
        super(name, accnum);
        setBalance(balance);
    }

    public String toString(){
        return super.toString()+"\nBalance: "+getBalance();
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public double calcTax(){
        double tax=.25;

        return getBalance()*tax;
    }

    public void lodge(double amount){
        setBalance(getBalance()+amount);
    }

    public void withdraw(double amount){
        setBalance(getBalance()-amount);
    }
}
