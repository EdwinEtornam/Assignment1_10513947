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
public class HowOldAreYou {
    public static void main(String[] args){
        //variable declaration and scanner object creation
        String name; 
        int age;
        Scanner input = new Scanner(System.in);
        //prompt statement and user input
        System.out.print("Hey, what's your name? ");
        name = input.next();
        System.out.println();
        System.out.print("Ok, "+name+", how old are you?");
        age = input.nextInt();
        System.out.println();
        //conditional statements based on user's response
        if (age<16){
            System.out.println("You can't drive "+name+".");
        }
        if (age<18){
            System.out.println("You can't vote "+name+".");
        }
        if (age<25){
            System.out.println("You can't rent a car "+name+".");
        }
        if(age==25||age>25){
            System.out.println("You can do anything that's legal "+name);
        }
    }
    
}
