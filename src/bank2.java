public class bank2 {
    private long AccountNumber;
    private String Name;
    private long PhoneNumber;
    private double Balance;
    private String Email;
    public bank2(){
        System.out.println("Empty Constructor is called");
    }
    public bank2(String name,long account,double balance,String email,long phone){
        this();
        this.Name=name;
        this.AccountNumber=account;
        this.Balance=balance;
        this.Email=email;
        this.PhoneNumber=phone;
    }
    public String getUserData(){
        return "Name- "+Name+" Account Number- "+AccountNumber+" Balance- "+Balance;
    }
    public void depositMoney(double depositbalance){
        this.Balance+=depositbalance;
        System.out.println("New Balance- "+ this.Balance);
    }
    public void withdrawMoney(double withdrawbalance){
        if(this.Balance<withdrawbalance){
            System.out.println("Balance unavailable");
        }
        else{
            this.Balance-=withdrawbalance;
            System.out.println("New Balance- "+this.Balance);
        }
    }
}
