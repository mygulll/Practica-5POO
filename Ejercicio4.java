import java.lang.Object;
public class Ejercicio4 {
    public static void main(String[] args) {
        Dog perro = new Dog("lorenso", 15);
        System.out.println(perro.toString());

        Fish pescado = new Fish("Dori" ,12);
        pescado.swim();
    }
}


class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void eat() {
        System.out.println(name + " is eating");
    }
    void sleep(){
        System.out.println(name+ " is sleeping");
    }

}

class Dog extends Animal {

    public Dog (String name, int age){
        super(name, age);
    }

    public void bark(){
        System.out.println(name + ": woof woof");
    }

}

class Cat extends Animal {
    public Cat (String name, int age){
        super (name, age);
    }
    public void purr(){
        System.out.println(name+"is purring");
    }
}

class Bird extends Animal {
    public Bird (String name, int age){
        super (name, age);
    }
    public void chirp(){
        System.out.println(name+"is chirping");
    }
}

class Fish extends Animal{
    public Fish(String name, int age) {
        super(name, age);
    }
    public void swim(){
        System.out.println(this.name+ " is swimming");
    }
}