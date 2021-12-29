package Inheritance;

public class main {
    public static void main(String args[]){
        Animal obj=new Animal("Dog","small",70,1);
        Dog shero=new Dog("Shero","Small",45,"barks","small","white");
        shero.eat();
        obj.eat();
    }
}
