

import java.util.Scanner;

public class BmiMain {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int i = 0;

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("BMI Calculator");



        System.out.print("Enter Name: ");
        String name = input.next();

        System.out.print("Enter age: ");
        int age = input.nextInt();

        System.out.print("Enter weight in pounds: ");
        Double weight = input.nextDouble();

        System.out.print("Enter height in inches: ");
        Double height = input.nextDouble();

        Person person = new Person(name, age, height, weight);


        while (i != 3) {
            System.out.println(" ");
            System.out.println("Welcome: " + person.getName());
            System.out.println("BMI Calculator");
            System.out.println("1. View User information");
            System.out.println("2. View BPI Results");
            System.out.println("3. Exit Program");
            System.out.print("Enter Input: ");
            i = input.nextInt();
            
            if (i == 1) {
                    System.out.println("----------------");
                    person.printInfo();
                    System.out.println("----------------");
                }
            
            else if(i == 2){
                System.out.println("----------------");
                Double bmi = BMI.calculateBMI(person);
                String result = BMI.getBMI(bmi);

                System.out.println("Bmi is " + bmi);
                System.out.println(result);

                System.out.println("----------------");
            }
            
        }
        System.out.println("----------------");
        System.out.println("Program Exit");
        System.out.println("Have a nice day ");
        System.out.println("----------------");
        input.close();
    }
}
