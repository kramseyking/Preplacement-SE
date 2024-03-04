import java.util.Scanner;
public class E17
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Values");
        int a = sc.nextInt();
        int b = a%10;
        int c = (a/10)%10; 
        int d = (a/100)%10;
        int e = (a/1000)%10;
        int f = (b*1000)+(c*100)+(d*10)+e;
        System.out.println("The answer is = "+f);
    }    
}