import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);

        System.out.println("enter a string");

        String checkForPali = scan.next();

        String strrrr = stringPasser(checkForPali);

        System.out.println(strrrr);

    }

    public static String stringPasser(String str)
    {
        String longestPalindrome = "";

        for(int i = 0; i < str.length(); i++)
        {
            for(int j = i+1; j <= str.length(); j++)
            {
                String tempString = str.substring(i, j);
                if(palindromeChecker(tempString))
                {
                    if(tempString.length() > longestPalindrome.length())
                    {
                        longestPalindrome = tempString;
                    }
                }
            }
        }
        return longestPalindrome;
    }

    public static boolean palindromeChecker(String potential)
    {
        int i = 0;
        int j = potential.length() - 1;

        while(j > i)
        {
            char front = potential.charAt(i++);
            char back = potential.charAt(j--);

            if(front != back)
            {
                return false;
            }
        }
        return true;
    }
}
