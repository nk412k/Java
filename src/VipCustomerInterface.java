public class VipCustomerInterface {
    public static void main(String args[]){
        VipCustomer obj1=new VipCustomer();
        VipCustomer obj2=new VipCustomer("Nk","Nokhalal@gmail.com");
        VipCustomer obj3=new VipCustomer("Nk",2000,"Nokhalal@gmail.com");
        System.out.println(obj1.getData());
        System.out.println(obj2.getData());
        System.out.println(obj3.getData());
        
    }
}
