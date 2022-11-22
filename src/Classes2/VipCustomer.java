package Classes2;
public class VipCustomer {
    String name;
    double creditLimit;
    String emailAddress;

    VipCustomer(String name,double creditLimit,String emailAddress)
    {
        this.name=name;
        this.creditLimit=creditLimit;
        this.emailAddress=emailAddress;
    }
    VipCustomer() {
        this("Lewandoski",2333,"lewa@barca.com");
    }
    VipCustomer(String name,double creditLimit) {
        this(name,creditLimit,"lewa123@barca.com");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
