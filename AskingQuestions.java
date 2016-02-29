/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**This  accepts inputs in the form of integers from the user and prints
 * out the inputs 
 *
 * @author Edwin Etornam
 */
import java.util.Scanner;
public class AskingQuestions{
    public static void main(String[] args){
        //variable declaration and initialization
        int age; //age of user
        int fHeight;//height in feet
        int iHeight;//height in inches
        int weight; //weight of the user
        //creating scanner object
        Scanner input = new Scanner(System.in);
        
        //prompt statement and accepting input
        System.out.print("How old are you? ");
        age = input.nextInt();
        System.out.println();
        //prompt statement and accept input for height in feet
        System.out.print("How many feet tall are you?");
        fHeight = input.nextInt();
        System.out.println();
        //prompt statement and accept input for height in inches
        System.out.print("And how many inches?");
        iHeight = input.nextInt();
        System.out.println();
        //prompt statement and accept input for weight
        System.out.print("How much do you weigh?");
        weight = input.nextInt();
        System.out.println();
        
        //printing all the results
        System.out.println("So, you're " + age + " old, " +fHeight+ 
                "'"+iHeight + "\""+" tall and " + weight + " heavy");
    }
    
}
