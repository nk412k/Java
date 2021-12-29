package Inheritance;

public class Animal {
    private String name;
    private String size;
    private int weight;
    private int brain;
    public Animal(String name,String size,int weight,int brain){
        this.name=name;
        this.size=size;
        this.weight=weight;
        this.brain=brain;
    }
    public void eat(){
        System.out.println("Animal eat");
    }
    public void move(){
        System.out.println("Animal move");
    }
}
