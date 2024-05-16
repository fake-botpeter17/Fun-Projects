class Pet{
    private String name;
    private int age;

    public Pet(String name, int age){
        this.name=name;
        this.age=age;
    }

    public String Introduce(){
        return "Hello!\nMy name is "+name+" and I am "+age+" years old.";
    }
    public String Speak(){
        return "I don't know what I speak";
    }
}

//Kowsiii - 8248007173

class Dog extends Pet{
    public Dog(String name,int age){
        super(name,age);
    }

    @Override
    public String Speak() {
        return "Bark! Bark!";
    }
}

class Cat extends Pet{
    public Cat(String Name, int age){
        super(Name,age);
    }

    @Override
    public String Speak(){
        return "Meow! Meow!";
    }
}

public class main{
    public static void main(String[] args){
        Dog Jimmy= new Dog("Jimmy",2);
        System.out.println(Jimmy.Introduce());
        System.out.println(Jimmy.Speak());
        Cat Tim= new Cat("Tim",3);
        System.out.println(Tim.Speak());
    }
}