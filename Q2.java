import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        Scanner intput=new Scanner(System.in);
        double x,area,perimeter;
        System.out.println("Enter radius of the circle:");
        x=intput.nextDouble();
        area=x*x*22/7;
        perimeter=2*x*22/7;
        System.out.println("Area of the circle = "+area);
        System.out.println("Perimeter of the circle = "+perimeter);

    }

}
