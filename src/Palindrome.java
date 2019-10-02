public class Palindrome {
    public static void main(String args[])
    {
        String s="MOM";
        String reverse=new StringBuffer(s).reverse().toString();
        if (s.equals(reverse))
        {
            System.out.println("String is palindrome");
        }
        else
        {
            System.out.println("string is not palindrome");
        }

    }
}
