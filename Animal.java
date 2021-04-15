public class Animal {
    String breed;
    String name;
    int legs;
    int eyes;
    public Animal(){

    }
    public void move(String name){
        System.out.println("Animal"+name+" Class Dog is moving");
    }
    public void move(int speed){
        System.out.println("Animal"+name+" Class Dog is moving at "+speed);
    }
    public Animal(String breed,String name,int legs,int eyes){
        this.breed=breed;
        this.eyes=eyes;
        this.name=name;
        this.legs=legs;
    }
}
