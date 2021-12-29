public class VipCustomer {
    private String Name;
    private long CreditLimit;
    private String Email;

    public VipCustomer() {
        this("Default Name",1000,"Default email");
    }

    public VipCustomer(String name, long creditLimit, String email) {
        Name = name;
        CreditLimit = creditLimit;
        Email = email;
    }

    public VipCustomer(String name, String email) {
        this(name,1000,email);
    }

    public String getData() {
        return Name+" "+CreditLimit+" "+Email;
    }


}
