import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
        Scanner intput=new Scanner(System.in);
        double x,y,w;
        System.out.println("Enter number 1:");
        x=intput.nextDouble();
        System.out.println("Enter number 2:");
        y=intput.nextDouble();
        w=x;
       x=y;
       y=w;
        System.out.println(" number 1="+x);
        System.out.println(" number 2="+y);

    }


}
