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
public class WorstGuessingGame {
    public static void main(String[] args){
		//variable declaration and scanner object creation
		Scanner input = new Scanner(System.in);
		int compuGuess;//= (int)(Math.random()*100)+1; //random number stored in the computer's guess
		int userGuess ;//user's input
                
                //computations
                System.out.println("WELCOME TO GUESSING GAME");
		System.out.println("Guess a random number between 1 and 10");
		compuGuess = (int)(Math.random()*10)+1;//generate random number from 1 to 10
                //accept user's guess
                userGuess=input.nextInt();
                //test to see if he was right
                if (userGuess<compuGuess){
                    System.out.println("Sorry, your input is less than the computer's guess");
                    System.out.println("Computer guess was "+compuGuess);
		}
		else if (userGuess>compuGuess){
			System.out.println("Sorry your input is greater than the computer's guess");
                        System.out.println("Computer guess was "+compuGuess);
		}
		else{
			System.out.println("Genius. I knew you had it in you!");
			
		}
    }
}
