package pkg06_switch_statement;

import java.util.Scanner;

/**
 * greetings based on gender
 * \n means new line;
 */
public class Main {

    public static void main(String[] args) {
        
        String gender;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your gender\nGender: ");
        gender = scanner.nextLine();
        gender = gender.toLowerCase();

	//similar to else if statement
        
        switch(gender){
            case "male":
                System.out.println("Hello sir.");
                break;
            case "female":
                System.out.println("Hello mam.");
                break;
            default:
                System.out.println("Hi there.");
                
        }
    }
    
}
