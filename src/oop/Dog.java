package oop;

public class Dog {

    private int paws = 4;
    private int tail = 1;
    private String name;
    private String breed;
    private String size;


    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if (size.equalsIgnoreCase("Big") || size.equalsIgnoreCase("Average") || size.equalsIgnoreCase("Small")) {
            this.size = size;
        } else {
            System.out.println("Size should be one of these: Big, Average or Small ");
        }
    }

    public  void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setPaws(int paws){
        if ( paws ==4 ) {
            this.paws = paws;
        } else {
            this.paws=1;
            System.out.println("User tried type fake value "+paws+"  paws for a dog");
        }

    }

    public int getPaws() {
        return paws;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        if ( tail == 1) {
        this.tail = tail;
        }else {
            this.tail = 1;
            System.out.println("User tried type fake value "+tail+" tail for a dog");
        }
    }
    public void bark () {
            if (size.equalsIgnoreCase("Big")){
                System.out.println("Wof-Wof");
            } else if (size.equalsIgnoreCase("Average")){
                System.out.println("Raf-Raf");
            }else{
                System.out.println("Tyaf-Tyaf");
            }
    }

    public void bite () {

    }
}
