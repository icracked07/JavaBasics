package Classes2;
public class Main {
    public static void main(String[] args) {
        Account ronnyaccount = new Account("676", 1000, "neymar", "neymar@gmail.com", "101010101001");
        ronnyaccount.getBalance();
        ronnyaccount.getPhoneNumber();
        ronnyaccount.withdrawl(200.0);
        ronnyaccount.deposit(700.0);
        ronnyaccount.setAccountNumber("777");
        ronnyaccount.setBalance(77.0);
        ronnyaccount.setCustomerName("CR7");
        ronnyaccount.setEmail("CR7@gmail.com");
        ronnyaccount.setPhoneNumber("123456789");
        Account messiaccount = new Account("Tim", "messi@gail.com", "12345");
        System.out.println(messiaccount.getAccountNumber() + " name " + messiaccount.getCustomerName());
        VipCustomer vip1 = new VipCustomer("Abuyameang",7);
        System.out.println(vip1.getName());
        VipCustomer vip2 = new VipCustomer("Laccazate",100,"laccazate@gmail.com");
        System.out.println(vip2.getName());
        VipCustomer vip = new VipCustomer();
        System.out.println(vip.getName());
    }
}