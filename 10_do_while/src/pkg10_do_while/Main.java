package pkg10_do_while;

import java.util.Scanner;

/**
 * Simple menu
 */
public class Main {


    public static void main(String[] args) {
        
        int a = 2;
        Scanner scanner = new Scanner(System.in);

	//runs atleast once, even if the condition is false
        
        do{
            System.out.print("Simple Menu:\n(0) Menu\n(1) Select\n(2) Exit\nOnly enter numbers\n\nOption: ");
            a = scanner.nextInt();
            
            if(a == 2){
                System.out.println("Bye");
            }
        }while(a != 2);
    }
    
}
