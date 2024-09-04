public class Hello
{
    public static void main(String[] args)
    {
        int a = 10;
        int b = 100;
        int c = 23;

        // if(a > b)
        // {
        //     if(a > c)
        //     {
        //         System.out.println("a is the largest number");
        //     }
        //     else
        //     {
        //         System.out.println("c is the largest number");
        //     }
        // }
        // else
        // {
        //     if(b > c)
        //     {
        //         System.out.println("b is the largest number");
        //     }
        //     else
        //     {
        //         System.out.println("c is the largest number");
        //     }
        // }

        if(a > b && a > c)
        {
            System.out.println("a is the largest number");
        }
        else if(b > a && b > c)
        {
            System.out.println("b is the largest number");
        }
        else
        {
            System.out.println("c is the largest number");
        }
    }
}