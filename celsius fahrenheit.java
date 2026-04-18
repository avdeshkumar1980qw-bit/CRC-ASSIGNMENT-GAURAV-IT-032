import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Celsius: ");
        float c = sc.nextFloat();

        float f = (c * 9/5) + 32;
        System.out.println("Fahrenheit: " + f);

        float c2 = (f - 32) * 5/9;
        System.out.println("Back to Celsius: " + c2);
    }
}