public class BankAccount {
    private long AccountNumber;
    private String Name;
    private long PhoneNumber;
    private double Balance;
    private String Email;
    public void setAccountNumber(long AccountNumber){
        this.AccountNumber=AccountNumber;
    }
    public void setName(String name){
        this.Name=name;
    }
    public void setPhoneNumber(long phonenumber){
        this.PhoneNumber=phonenumber;
    }
    public void setBalance(double balance){
        this.Balance=balance;
    }
    public void setEmail(String email){
        this.Email=email;
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
