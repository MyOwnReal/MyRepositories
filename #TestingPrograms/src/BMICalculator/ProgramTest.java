package BMICalculator;

import java.util.GregorianCalendar;
import java.util.Scanner;



public class ProgramTest {

public static void main(String[] args){

     double weight;
     double height;

     double BMI;


    GregorianCalendar today = new GregorianCalendar();

        System.out.println("Please give your name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

    System.out.println("Hello " + name+ " in your BMI calc, today is: ");
    System.out.printf("%tc", today);
    System.out.println(" ");
    System.out.println("Please give your height :");
    height  = input.nextInt();
    System.out.println("Your height is "+ height+ " cm ");
    System.out.println("Please give your weight :");
    weight = input.nextInt();
    System.out.println("Your weight is "+ weight+ " kg");
    height = height/100;
    BMI = (weight/Math.pow(height,2));

    if (BMI <18.5){

        System.out.println("You're to skinny and your BMI is: " + BMI);
    }
    else if (BMI>25.0){
        System.out.println("You must loose your weight and your BMI is: "+ BMI);
    }
    else{
        System.out.println("Your weight is in normal condidtion and your BMI is: "+ BMI);
    }

    input.close();
}
}
