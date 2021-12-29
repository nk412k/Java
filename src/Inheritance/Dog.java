package Inheritance;

public class Dog extends Animal{
    private String voice;
    private String tail;
    private String color;

    public Dog(String name,String size,int weight,String voice,String tail,String color){
        super(name,size,weight,1);
        this.voice=voice;
        this.tail=tail;
        this.color=color;
    }
    @Override
    public void eat(){
        System.out.println("Dog chew");
        super.eat();

    }

}
