package oop;

public class Main {
    public static void main(String[] args) {

        Dog labrador = new Dog();

        labrador.setPaws(8);
        labrador.setTail(5);
        labrador.setBreed("Lab");
        labrador.setName("Charlie");
        labrador.setSize("Average");
        labrador.bark();
        Dog sheppard = new Dog();

        sheppard.setPaws(2);
        sheppard.setTail(5);
        sheppard.setBreed("Sheppard");
        sheppard.setName("Mike");
        sheppard.setSize("Big");
        sheppard.bark();

        System.out.println("Labs name is "+ labrador.getName());
        System.out.println("Sheppard name is "+ sheppard.getName());
        System.out.println("Lab has "+labrador.getTail()+" paws");
    }


}
