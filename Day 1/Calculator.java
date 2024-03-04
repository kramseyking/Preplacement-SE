import java.util.Scanner;
public class Calculator
{
    public static void AreaOfCircle()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Values");
        double r = sc.nextDouble();
        double area = 3.14*r*r;
        System.out.println("The Value is "+area);
    }
    public static void CircumOfCircle()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Values");
        double r = sc.nextDouble();
        double circum = 2*3.14*r;
        System.out.println("The Value is "+circum);
    }
    public static void AreaOfRectangle()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Values");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double area = a * b;
        System.out.println("The Value is "+area);
    }
    public static void VolumeOfSphere()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Values");
        double r = sc.nextDouble();
        double vol = (4/3)*3.14*r*r*r;
        System.out.println("The Value is "+vol);
    }
    public static void SurfaceOfSphere()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Values");
        double r = sc.nextDouble();
        double surface = 4*3.14*r*r;
        System.out.println("The Value is "+surface);
    }
    public static void AreaOfSphere()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Values");
        double r = sc.nextDouble();
        double area = 4*3.14*r*r;
        System.out.println("The Value is "+area);
    }
    public static void AreaOfRightTri()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Values");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double area = (1/2)*(a * b);
        System.out.println("The Value is "+area);
    }
    public static void AreaOfEquilateralTri()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Values");
        double a = sc.nextDouble();
        double area = (Math.sqrt(3)/4)*a*a;
        System.out.println("The Value is "+area);
    }
    public static void PeriOfRectangle()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Values");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double peri = a + b;
        System.out.println("The Value is "+peri);
    }
    public static void AreaOfTri()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Values");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double area = (1/2)*(a * b);
        System.out.println("The Value is "+area);
    }
}