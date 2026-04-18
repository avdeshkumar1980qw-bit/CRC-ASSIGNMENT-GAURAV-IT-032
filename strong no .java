import java.util.Scanner;

public class StrongNumber {
    public static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) f *= i;
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0, temp = n;

        while (temp != 0) {
            int d = temp % 10;
            sum += fact(d);
            temp /= 10;
        }

        if (sum == n)
            System.out.println("Strong Number");
        else
            System.out.println("Not Strong");
    }
}