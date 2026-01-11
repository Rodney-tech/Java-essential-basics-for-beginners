package pkg07_nested_if_statement;

import java.util.Scanner;

/**
 * binary or decimal
 * && = AND
 * || = OR
 * ! = NOT
 * \n means new line;
 */


public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("What is 1 + 1: ");
        int answer = scanner.nextInt();
        
        if(answer == 2 || answer == 3){
            System.out.print("In Decimal or Binary: ");
            scanner.nextLine();
            String reply = scanner.nextLine().toLowerCase();
            
            if(reply.equalsIgnoreCase("decimal") && answer == 2){
                System.out.println("Correct");
            }else if(reply.equalsIgnoreCase("binary") && answer == 3){
                System.out.println("Correct");
            }else{
                System.out.println("Incorrect");
            }
        }else{
            System.out.println("Incorrect");
        }
    }
    
}
