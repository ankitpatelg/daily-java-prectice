/* 
2 Q . This is a Java Program to Reverse a Given Number.
 * @Author: Ankit patel
@Date: 26/10/22*/

import java.util.Scanner;
public class Reverse_Number 
{
    public static void main(String args[])
    {
        int m, n, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        m = s.nextInt();
        while(m > 0)
        {
            n = m % 10;
            sum = sum * 10 + n;
            m = m / 10;
        }
        System.out.println("Reverse:"+sum);
    }
}