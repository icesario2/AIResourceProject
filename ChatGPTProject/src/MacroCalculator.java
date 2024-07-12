import java.util.Scanner;

public class MacroCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for weight, height, and age
        //System.out.print("Enter your weight in kg: ");
        double weight = 210;//scanner.nextDouble();

        //System.out.print("Enter your height in cm: ");
        double height = 73;//scanner.nextDouble();

        //System.out.print("Enter your age: ");
        int age = 30;//scanner.nextInt();

        // Calculate BMR using the Harris-Benedict equation
        double bmr = 88.362 + (13.397 * weight) + (4.799 * height) - (5.677 * age);

        // Estimate TDEE (assuming a moderate activity level)
        double tdee = bmr * 1.55;

        // Calculate macronutrient requirements based on TDEE
        double protein = weight * 2.2; // 2.2 grams of protein per kg of body weight
        double fat = tdee * 0.25 / 9;  // 25% of TDEE from fat, 9 calories per gram of fat
        double carbs = (tdee - (protein * 4) - (fat * 9)) / 4; // Remaining calories from carbs, 4 calories per gram of carbs

        // Print the results
        System.out.println("Based on your input:");
        System.out.printf("BMR: %.2f calories/day\n", bmr);
        System.out.printf("TDEE: %.2f calories/day\n", tdee);
        System.out.printf("Protein: %.2f grams/day\n", protein);
        System.out.printf("Fat: %.2f grams/day\n", fat);
        System.out.printf("Carbohydrates: %.2f grams/day\n", carbs);

        scanner.close();
    }
}