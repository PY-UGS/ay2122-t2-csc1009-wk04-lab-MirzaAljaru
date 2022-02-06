public class Person {
    private double height;
    private double weight;
    

    public Person(){

    }
    
    public Person(double height, double weight) {
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

    
    public void printInfo(){
        System.out.println("Weight [pounds]: " + this.weight);
        System.out.println("Height [inches]: " + this.height);
    }
    

}
