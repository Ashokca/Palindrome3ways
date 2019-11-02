import java.util.*;
public class Recursion
{
    public static void main()
    {
        Scanner scan = new Scanner(System.in);
        String user;
        int test = 0, test2 = 0;
        char test3;
        
        do
        {
        test = 0;
        test2 = 0;
        System.out.println("Enter a word to test for a palindrome");
        user = scan.next();
        boolean answer = check(user, test, test2);
        
            if(answer == true)
            {
                System.out.println("true");
            }
            else
                System.out.println("false");
        System.out.println("Would you like to try another word?(Y/N)");
        test3 = scan.next().charAt(0);
        }
        while(test3 == 'y' || test3 == 'Y');
    }
    
    public static boolean check(String user, int test, int test2)
    {
        if(test <= (user.length() - 1))
        {
            if(user.charAt(test) == user.charAt(((user.length() - 1) - test)))
            {
                test++;
                test2++;
                check(user, test, test2);
            }
        }
        if(test2 == 1)
        {
            return true;
        }
        else
            return false;
    }
}