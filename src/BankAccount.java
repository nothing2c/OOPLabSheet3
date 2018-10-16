public abstract class BankAccount implements Taxable,Transactable {
    protected String name;
    protected int accnum;

    public BankAccount(){
        this("No Name",0);
    }

    public BankAccount(String name, int accnum){
        setName(name);
        setAccnum(accnum);
    }

    public String toString(){
        return "\nName: "+getName()+"\nAccount Number: "+getAccnum();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAccnum(int accnum) {
        this.accnum = accnum;
    }

    public int getAccnum() {
        return accnum;
    }

    public abstract double calcTax();

    public abstract void lodge(double amount);

    public abstract void withdraw(double amount);
}
