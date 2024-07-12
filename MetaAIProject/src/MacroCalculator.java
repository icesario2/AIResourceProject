import java.util.Scanner;

public class MacroCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //System.out.println("Enter your weight in pounds:");
        double weight = 210;//scanner.nextDouble();

        //System.out.println("Enter your height in inches:");
        double height = 73;//scanner.nextDouble();

        //System.out.println("Enter your age in years:");
        double age = 30;//scanner.nextDouble();

        double protein = calculateProtein(weight);
        double carbohydrates = calculateCarbohydrates(weight, height, age);
        double fat = calculateFat(weight, height, age);

        System.out.println("Daily Macro-Nutrient Needs:");
        System.out.println("Protein: " + protein + " grams");
        System.out.println("Carbohydrates: " + carbohydrates + " grams");
        System.out.println("Fat: " + fat + " grams");
    }

    private static double calculateProtein(double weight) {
        // Recommended daily intake of protein is 0.8-1.2 grams per kilogram of body weight
        // Assuming a moderate protein intake of 1 gram per kilogram
        return weight * 0.453592 * 1;
    }

    private static double calculateCarbohydrates(double weight, double height, double age) {
        // Recommended daily intake of carbohydrates is 45-65% of total daily calories
        // Assuming a moderate carbohydrate intake of 55% of total daily calories
        double totalDailyCalories = calculateTotalDailyCalories(weight, height, age);
        return totalDailyCalories * 0.55 * 4 / 4;
    }

    private static double calculateFat(double weight, double height, double age) {
        // Recommended daily intake of fat is 20-35% of total daily calories
        // Assuming a moderate fat intake of 25% of total daily calories
        double totalDailyCalories = calculateTotalDailyCalories(weight, height, age);
        return totalDailyCalories * 0.25 * 9 / 4;
    }

    private static double calculateTotalDailyCalories(double weight, double height, double age) {
        // Estimated total daily energy expenditure for males
        // Based on the Harris-Benedict equation
        double bmr = 66 + (6.2 * weight * 0.453592) + (12.7 * height * 0.0254) - (6.8 * age);
        return bmr * 1.2; // Assuming a moderate activity level
    }
}