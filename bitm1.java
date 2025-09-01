import java.util.*;
class bitm1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int c=0;
        while(n != 0)
        {
            if((n & 1)==1)
            {
                c++;
            }
            n>>=1;
        }
        System.out.println("No. of 1s ="+c);
    }
}