/*
q3. This is a Java Program to Convert a Number Decimal System to Binary System using Recursion
auther: ankit patel
date: 05/11/2022
*/
import java.util.Scanner;
public class Convert
{
    public static void main(String[] args) 
    {
        int n;
        String x;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any decimal number:");
        n = s.nextInt();
        Convert obj = new Convert();
        x = obj.binary(n);
        System.out.println("Binary number:"+x);
    }
    String binary(int y)
    {
        int a;
        if(y > 0)
        {
            a = y % 2;
            return (binary(y / 2) + "" +a);
        }
        return "";
    }
}