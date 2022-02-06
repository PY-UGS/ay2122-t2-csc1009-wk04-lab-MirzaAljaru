

import java.util.Scanner;

public class BmiMain {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("BMI Calculator");



        System.out.print("Enter weight in pounds: ");
        Double weight = input.nextDouble();

        System.out.print("Enter height in inches: ");
        Double height = input.nextDouble();

        Person person = new Person(height, weight);

        System.out.println("----------------");
        Double bmi = BMI.calculateBMI(person);
        String result = BMI.getBMI(bmi);

        System.out.println("Bmi is " + bmi);
        System.out.println(result);

        System.out.println("----------------");

        input.close();
    }
}
