import java.util.Scanner;

public class Q9 {

    public static void main(String[] args) {


        Scanner intput=new Scanner(System.in);
        int x,y,z;
        System.out.println("Enter the number 1:");
        x = intput.nextInt();
        System.out.println("Enter the number 2:");
        y = intput.nextInt();
        System.out.print("Sum: ");
        System.out.println(x+y);
        System.out.print("Difference: ");
        System.out.println(x-y);
        System.out.print("Product: ");
        System.out.println(x*y);
        System.out.print("Average: ");
        System.out.println((x+y)/2.0);
        System.out.print("Distance: ");
        z=(x-y);
        if(y>x)
         z=-z;
        System.out.println(z);
        System.out.print("Maximum:");
        System.out.println(Math.max(x,y));
        System.out.print("Minimum: ");
        System.out.println(Math.min(x,y));

    }
}
