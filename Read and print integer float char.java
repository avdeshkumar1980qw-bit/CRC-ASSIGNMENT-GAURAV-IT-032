import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        float f = sc.nextFloat();
        char c = sc.next().charAt(0);

        System.out.println(i);
        System.out.println(f);
        System.out.println(c);
    }
}