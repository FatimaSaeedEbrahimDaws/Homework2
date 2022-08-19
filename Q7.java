public class Q7 {
    public static void main(String[] args) {
     String name ="Fatima Saeed";

        System.out.println("Get the first  character of (Fatima Saeed) : "+name.charAt(0));
        System.out.println("Get the last   character of (Fatima Saeed) : "+name.charAt(10));
        System.out.println("Remove the first  character of (Fatima Saeed) : "+name.replaceAll("F","") );
        System.out.println("Remove the last   character of (Fatima Saeed) : "+name.replace("d","") );
    }
}