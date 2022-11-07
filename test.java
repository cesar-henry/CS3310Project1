import java.util.Scanner;

public class test
{
    public static void main(String[] args)
    {
        System.out.println("Hello World");

        Scanner input = new Scanner(System.in);
        System.out.println("What is your name: ");

        String firstName = input.next();
        System.out.println("Your name is " + firstName);
    }
}