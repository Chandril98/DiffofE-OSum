/* WTP to determine even and odd position digit of a given number .
 Then print the difference of their sum  */

import java.util.*;
public class Numtwist
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int SumOdd=0,SumEven=0,i=0;
        while (num!=0)
        {
            if (i%2==0)
                SumOdd +=num%10;
            else
                SumEven +=num%10;
            num =num/10;
            i++;
        }
        System.out.println();
        System.out.print("Difference between odd and even position digit sum of the number is : ");
        if(SumOdd>SumEven)
        System.out.println(SumOdd-SumEven);
        else
        System.out.println(SumEven-SumOdd);
    }
}