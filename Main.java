import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double x;
        double y;
        double z;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter side 1: ");
        x=sc.nextDouble();

        System.out.println("Enter side 2: ");
        y=sc.nextDouble();

        z=Math.sqrt((x*x)+(y*y));

        System.out.println("Hypotenuse: "+Math.sqrt(z));


    }
}