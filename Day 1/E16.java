import java.util.Scanner;
public class E16 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Values");
        int a = sc.nextInt();
        int b = a%10;
        int c = (a/10)%10; 
        int d = (a/100)%10;
        int e = b + c + d;
        System.out.println("The answer is = "+e);
    }    
}