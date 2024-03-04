import java.util.Scanner;
public class MyCal 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int ch;
        do
        {
            System.out.println("1.Calculate area of circle");
            System.out.println("2.Calculate cicumfrence of circle");
            System.out.println("3.Calculate area of rectangle");
            System.out.println("4.Calculate volume of sphere");
            System.out.println("5.Calculate surface area of sphere");
            System.out.println("6.Calculate area of sphere");
            System.out.println("7.Calculate area of right angle triangle");
            System.out.println("8.Calculate area of equilateral triangle");
            System.out.println("9.Calculate perimeter of rectangle");
            System.out.println("10.Calculate area of triangle");
            ch = sc.nextInt();
            switch(ch)
            {
                case 1:
                    new Calculator().AreaOfCircle();
                    break;
                case 2:
                    new Calculator().CircumOfCircle();
                    break;
                case 3:
                    new Calculator().AreaOfRectangle();
                    break;
                case 4:
                    new Calculator().VolumeOfSphere();
                    break;
                case 5:
                    new Calculator().SurfaceOfSphere();
                    break;
                case 6:
                    new Calculator().AreaOfSphere();
                case 7:
                    new Calculator().AreaOfRightTri();
                    break;
                case 8:
                    new Calculator().AreaOfEquilateralTri();
                    break;
                case 9:
                    new Calculator().PeriOfRectangle();
                    break;
                case 10:
                    new Calculator().AreaOfTri();
                    break;
            }
        }while(ch!=0);
    }
}
