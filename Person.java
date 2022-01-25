public class Person {
    private String name;
    private int age;
    private double height;
    private double weight;
    

    public Person(){

    }
    
    public Person(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }


    public double getWeight() {
        return weight;
    }


    public void setWeight(double weight) {
        this.weight = weight;
    }


    public double getHeight() {
        return height;
    }


    public void setHeight(double height) {
        this.height = height;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }
    
    public void printInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Weight [pounds]: " + this.weight);
        System.out.println("Height [inches]: " + this.height);
    }
    

}
