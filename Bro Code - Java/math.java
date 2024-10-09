import java.util.Scanner;
import java.util.Random;

public class math {
    public static void main(String[] args) {
        //hypotenus of a triangle
        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side x: ");
        x = scanner.nextDouble();

        System.out.println("Enter side y: ");
        y = scanner.nextDouble();

        z = Math.sqrt((x*x) + (y*y));
        System.out.println("The hypotenus is: " + z);

        scanner.close();

        //Random number generator
        Random random = new Random();
        int o = random.nextInt(6) + 1;
        System.out.println("Random number: " + o);
    }
}
