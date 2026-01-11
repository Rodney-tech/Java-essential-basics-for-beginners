package pkg04_if_statement;

import java.util.Scanner;

/**
 * basic multiple choice using if statement
 * \n means new line;
 */
public class Main {

    public static void main(String[] args) {
        
        char option;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Riddle Time\nWhat has many key but, opens no door\nA. Lock\nB.Keyboard\nC. Piano\nD. Map\n\n(NB) choose a letter A,B,C or D");
        System.out.print("Answer: ");
        option = scanner.next().charAt(0);
        
        
        option = Character.toLowerCase(option);
        
	//if statement only runs the code if the condition inside is true
        if(option == 'c'){
            System.out.println("Correct");
        }else{
            System.out.println("Correct answer is 'C'");
        }
    }
    
}
