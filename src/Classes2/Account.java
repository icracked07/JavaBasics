package Classes2;
public class Account {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    Account() {
        this("111",234.0,"messi","messi10@gmail.com","1234569");
        // this is calling another constructor from this constructor.
        // always should be the first line.
        System.out.println("Empty constructor is called");
    }
    public Account(String customerName, String email, String phoneNumber) {
        //this.customerName = customerName;
        //this.email = email;
        //this.phoneNumber = phoneNumber;
        this("727",100.55,customerName,email,phoneNumber);
        // other two parameters created by computer automatically.
    }

    // calling one constructor from another.
    Account(String accountNumber, double balance, String customerName, String email, String phoneNumber){
        this.accountNumber=accountNumber;
        //setAccountNumber(accountNumber);
        // this would help in validation kind of thing
        this.balance=balance;
        this.customerName=customerName;
        this.email=email;
        this.phoneNumber=phoneNumber;
    }
    public void deposit(double depositAmount){
        this.balance = depositAmount+this.balance;
        System.out.println("deposit of "+depositAmount +" made. New Balance is "+ this.balance);
    }
    public void withdrawl(double withdrawlAmount){
        if(this.balance - withdrawlAmount < 0){
            System.out.println("only "+ this.balance + " available withdrawl not processed.");
        } else {
            this.balance-=withdrawlAmount;
            System.out.println("withdrawl of " +withdrawlAmount+ " processed.");
        }
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
