public class BMI {

    public static double calculateBMI(Person person){
        double weight = person.getWeight() * 0.45359237;
        double height = person.getHeight() * 0.0254;
        double bmi = weight / Math.pow(height, 2);

        return bmi;

    }
    public static String getBMI(double bmi){
        String BMIResult = "";
        if (bmi < 18.5) {
            BMIResult = "Underweight";
        }
        else if(bmi < 25.0){
            BMIResult = "Normal";
        }
        else if(bmi < 30.0){
            BMIResult = "Overweight";
        }
        else{
            BMIResult = "Obese";
        }
        return BMIResult;
    }

}
