import java.util.Scanner;
/**
 * Created by Jc337839 on 21/08/17.
 */
public class FormLetterWriter
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Last name: ");
        String lastName = scanner.next();
        displaySalutation(lastName);
        System.out.print("First name: ");
        String firstName = scanner.next();
        displaySalutation(firstName, lastName);
    }
    public static void displaySalutation(String lastName)
    {
        System.out.println("Dear Mr. or Ms. " + lastName);
        System.out.println("Thank you for your recent order");
    }
    public static void displaySalutation(String firstName, String lastName)
    {
        System.out.println("Dear " + firstName + " " + lastName);
        System.out.println("Thank you for your recent order");
    }
}
