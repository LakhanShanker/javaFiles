public class Dog extends Animal{
    Animal animal1=new Animal("fluffy","tom",4,2);
    Animal animal2=new Animal("flutter","sam",4,2);
    Animal animal3=new Animal("shephard","curran",4,1);
    Animal animal4=new Animal("daniel","shanaya",5,2);
    public void move(String name){
        System.out.println(name);
        animal1.move(10);
        animal3.move(20);
        super.move("lakhan");
    }


}
