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
public class AgeInFiveYears {
    public static void main(String[] args){
        //variable declaration and scanner object creation
        String name;
        int age =0 ;
        Scanner input = new Scanner (System.in);
        //prompt statement and data input
        System.out.println("Hello. What is your name?");
        name = input.next();
        System.out.println("Hi! " + name + "How old are you?");
        age = input.nextInt();
        int newAge = age + 5; //age after 5 years
        int prevAge = age - 5;//age 5 years ago
        System.out.println("Did you know that in 5 years you will be " + newAge +"years old? ");
        System.out.println("And five years ago you were " + prevAge + "! Imagine that");
    }
}
