package pkg02_user_input;

import java.util.Scanner;

/**
 * Scan and print user input e.g name, surname, age
 */
public class Main {

    public static void main(String[] args) {
        
        String name,surname; //You can declare multiple variables at once
        int age;
        
        Scanner scanner = new Scanner(System.in); //Scanner is used for getting user input
        
        System.out.print("Enter your name: ");
        name = scanner.nextLine(); //FOR scanning a string variable
        System.out.print("Enter your surname: ");
        surname = scanner.nextLine();
        System.out.print("Enter your age: ");
        age = scanner.nextInt(); //FOR scanning an integer
        
        // \n means new line
        System.out.println("\nDetails Entered\nName: " + name + "\nSurname: " + surname + "\nAge: " + age);
    }
    
}
