import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner intput=new Scanner(System.in);
        double x,y,w,average;
        System.out.println("Enter number 1:");
        x=intput.nextDouble();
        System.out.println("Enter number 2:");
        y=intput.nextDouble();
        System.out.println("Enter number 3:");
        w=intput.nextDouble();
       average=(x+y+w)/3;
       System.out.println("Average of 3 number = "+average);


    }
}
