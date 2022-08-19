import java.util.Scanner;

public class Q3 {


    public static void main(String[] args) {
        Scanner intput=new Scanner(System.in);
        double x,y,area,perimeter;
        System.out.println("Enter length of the rectangle:");
        x=intput.nextDouble();
        System.out.println("Enter width of the rectangle:");
        y=intput.nextDouble();
        area=x*y;
        perimeter=2*(x+y);
        System.out.println("Area of the circle = "+area);
        System.out.println("Perimeter of the circle = "+perimeter);

    }
}
