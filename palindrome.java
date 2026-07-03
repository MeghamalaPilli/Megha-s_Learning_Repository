import java.util.Scanner;

public class StrPal()
{
    public static boolean strpal(String str)
    {
        if(str.length() <=1)
        {
            return true;
        }
        if(str.charAt(0)!=str.charAt(str.length()-1))
        {
            return false;
        }
        return strpal(str.substring(1,str.length()-1));
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String input=sc.nextLine();
        if(strpal(input))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}