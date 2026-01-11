
package pkg03_user_input_v2;

import javax.swing.JOptionPane;

/**
 * Scan and print user input e.g name, surname, age
 */

public class Main {

    public static void main(String[] args) {
        
        String name,surname;
        int age = 0;
        

	JOptionPane scans strings, for integers we need a try catch block, in this case is for numbers

        name = JOptionPane.showInputDialog("Enter your name");
        surname = JOptionPane.showInputDialog("Enter your surname");
        
        try{
	    //If input is not a number, we catch an exception

            age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        }catch (NumberFormatException ex){
            System.out.println(ex.getMessage());
        }
        
        System.out.println("\nDetails Entered\nName: " + name + "\nSurname: " + surname + "\nAge: " + age);
    }
    
}
