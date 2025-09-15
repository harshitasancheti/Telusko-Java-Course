import java.util.Scanner;
public class SmartCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String again = "y";

        // TODO: Use a while loop to keep calculating while 'again' is 'y'
        while(again.equalsIgnoreCase("y")){
            
        // TODO: Ask user for two numbers
            System.out.print("Enter first number: ");
            double n1 = input.nextDouble();
            System.out.print("Enter second number: ");
            double n2 = input.nextDouble();
            input.nextLine();
        
        // TODO: Ask user for the operation (+, -, *, /)
            System.out.println("Choose operation (+, -, *, /): ");
            char operation = input.nextLine().charAt(0);
        
        // TODO: Use if-else to perform the operation
            if(operation == '+'){
                System.out.println("Result: "+(n1+n2));
            } else if(operation == '-'){
                System.out.println("Result: "+(n1-n2));
            } else if (operation == '*'){
                System.out.println("Result: "+(n1*n2));
            } else if (operation == '/'){
            // TODO: Handle division by zero case
                if (n2==0){
                    System.out.println("cannot divide by zero.");
                } else{
                    System.out.println("Result: "+(n1/n2));
                }
            } else {
                System.out.println("Invalid operation. Please choose +, -, *, or /.");
            }
        
        
        // TODO: Ask if user wants to continue
        System.out.println("Do you want to calculate again? (y/n): ");
        again = input.nextLine();
        }
        // TODO: Exit the loop and print a thank you message
        System.out.println("Thank you for using the calculator.");
        input.close();
    }
}

