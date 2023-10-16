import java.util.*;
import java.lang.Math;
class Task1
{
    public static void main(String args[])
    {
        System.out.println("Welcome to the Number Game");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the minimum and maximum range");
        int min=sc.nextInt();
        int max=sc.nextInt();
        int r=(int)(Math.random()*(max-min+1)+min);
        int numberOfTries = 0;
        int userGuess = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("I have selected a random number between " + min + " and " + max + ". Try to guess it.");
        while (userGuess != r)
        {
            System.out.print("Enter your guess = ");
            userGuess = sc.nextInt();
            numberOfTries++;
            if (userGuess < min || userGuess > max)
            System.out.println("Your guess is out of the specified range! Try again wrt the specified range");
            else if (userGuess < r)
            System.out.println("Your guess is too low. Try again.");
            else if (userGuess > r)
            System.out.println("Your guess is too high. Try again.");
        }
        System.out.println("Congratulations! You guessed the number "+ r+ " correctly in "+numberOfTries+" tries.");
    }
}