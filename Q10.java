import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

public class Q10 {


    public static void main(String[] args) {


        int x,y,z;
        x=20;
        y=25;
        double w=(x+y)/2.0000;
        System.out.print("Sum:            ");
      //  System.out.println(Setw);
        System.out.println(x+y);
        System.out.print("Difference:     ");
        System.out.println(x-y);
        System.out.print("Product:       ");
        System.out.println(x*y);
        System.out.print("Average:        ");
       //DecimalFormat df =new DecimalFormat("#.00");
     // w=Float.valueOf(df.format((24.456f)));
        System.out.println(w);
        System.out.print("Distance:        ");
        z=(x-y);
        if(y>x)
            z=-z;
        System.out.println(z);
        System.out.print("Maximum:        ");
        System.out.println(Math.max(x,y));
        System.out.print("Minimum:        ");
        System.out.println(Math.min(x,y));

    }
}
