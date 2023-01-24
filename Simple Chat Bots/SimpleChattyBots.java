import java.util.Scanner;
public class SimpleChattyBots {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! My name is Krattza");
        System.out.println("I was created in 2023");
        System.out.println("Please, remind me your name");
        
        String name = scanner.next();

        System.out.println("What a great name you have, " +  name + "!");
        //Ask to guess their ages by asking the remainders of 3 5 and 7 by their age.
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        
        int remainder3 = scanner.nextInt();
        int remainder5 = scanner.nextInt();
        int remainder7 = scanner.nextInt();

        //Put the 3 remainders in the following equation.
        int age = ((remainder3 * 70) + (remainder5 * 21) + (remainder7 * 15)) % 105;

        // Print the age with the given statement in the sample.
        System.out.println("Your age is " + age + "; that's a good time to start programming!");


    }
}