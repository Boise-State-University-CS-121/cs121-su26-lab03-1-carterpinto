import java.util.Scanner;

public class SphereCalculator {
    
    public static void main(String[] args)
    {
        try (Scanner kbd = new Scanner(System.in)) {
            
            
            
            System.out.print("Enter the sphere's radius: ");
            double radius = kbd.nextDouble();
            
            
            double volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
            System.out.printf("Volume: %.4f%n", volume);

            double surfacearea = (4) * Math.PI * Math.pow(radius, 2);
            System.out.printf("Surface area: %.4f%n", surfacearea);

            
        }
    }
}
