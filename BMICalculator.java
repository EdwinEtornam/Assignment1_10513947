/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Edwin Etornam
 */
import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args){
        //variable declaration and Scanner object creation
        double height, BMI, iHeight, fHeight;
        double weight, pWeight;
        Scanner input = new Scanner(System.in);
        
        //prompt and user input
        System.out.print("Your height in m: ");
        height = input.nextDouble();
        System.out.print("Your weight in kg:");
        weight = input.nextInt();
        BMI = weight/height*height;
        System.out.println("Your BMI is "+BMI);
        
        //For inches and pounds (height and weight respectively)
        System.out.println();
        System.out.print("Your height in inches: ");
        height = input.nextDouble();
        iHeight = height*0.0254;
        System.out.print("Your weight in pounds:");
        weight = input.nextInt();
        pWeight = weight*0.453592;
        BMI = pWeight/iHeight*iHeight;
        System.out.println("Your BMI is "+BMI);
        
        //for height in feet and inches and weight in pounds
         System.out.println();
        System.out.print("Your height (feet only):");
        fHeight = input.nextDouble();
        fHeight *= 0.3048;
        System.out.print("Your height (inches): ");
        iHeight = iHeight*0.0254;
        height = fHeight*iHeight;
        System.out.print("Your weight in pounds:");
        weight = input.nextInt();
        pWeight = weight*0.453592;
        BMI = pWeight/height*height;
        System.out.println("Your BMI is "+BMI);
        
    }
    
}
