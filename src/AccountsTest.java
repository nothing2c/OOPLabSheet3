public class AccountsTest {
    public static void main(String[] args) {

        SavingsAccount account1 = new SavingsAccount();

        System.out.println(account1.toString());

        account1.setName("Ryan");
        account1.setAccnum(12345);
        account1.setBalance(9999.99);

        System.out.println(account1.toString()+"\nTax is "+account1.calcTax());

        SavingsAccount account2 = new SavingsAccount("Jim", 67890, 12.5);

        System.out.println(account2.toString()+"\nTax is "+account2.calcTax());

        account2.lodge(50);
        System.out.println(account2.toString());

        account2.withdraw(100);

        System.out.println(account2.toString());
    }
}
