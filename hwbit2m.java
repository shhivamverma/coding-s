import java.util.*;                                                            // find if a number is a power of 2 or not
class hwbit2m
{                                                                               // Example:-
    public static void main(String args[])                                      // Enter a no.
    {                                                                           // 8
        Scanner sc=new Scanner(System.in);                                      // NO
        System.out.println("Enter a number");
        int n=sc.nextInt();
        if((n&(n-1)) == 0)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }

}
