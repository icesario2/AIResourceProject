import javax.print.DocFlavor;

public class Main {
    public static void main(String[] args) {
        Main.calculateMacro(210, 73, 30);

    }

    public static void calculateMacro(int weight, int height, int age  ){

        double ree; //resting energy expend
        double tdee; //total daily energy expeneture
        double carbs;
        double fats;
        double protein;

        ree = 10 * (weight * 0.453592) + 6.25 * (height * 2.54) - 5 * age + 5; // this is based on a males standard

        tdee = ree * 1.55; // this is the fomula for moderate levels of activity

        //carbs = 43%, fats 27%, protein 30%
        //4 calories per gram of carbs
        carbs = (tdee * 0.50) / 4;
        //9 calories per gram of fat
        fats = (tdee * 0.26) / 9;
        //4 calories per gram of protien
        protein = (tdee * 0.24) / 4;

        System.out.println("total calories burned daily: " + tdee + " carbs in grams needed: " + carbs + " fats in grams: " + fats + " protein in grams: " + protein);

    }
}