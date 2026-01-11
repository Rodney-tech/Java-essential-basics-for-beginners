package pkg05_else_if_statement;

import java.util.Scanner;

/**
 * discount based on age group
 * \n means new line;
 */

public class Main {

    public static void main(String[] args) {
        
        int age;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your age to check discount\nAge: ");
        age = scanner.nextInt();

	//if the first condition is false check the next, if also false then run the code in the else part
        
        if(age > 0 && age <= 12){
            System.out.println("20% discount on Kids");
        }else if(age > 50){
            System.out.println("30 % discount");
        }else{
            System.out.println("Your middle age pay full amount");
        }
        
        
    }
    
}
