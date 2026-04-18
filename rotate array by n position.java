import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int k = sc.nextInt(); // rotations

        for (int r = 0; r < k; r++) {
            int first = arr[0];
            for (int i = 0; i < n - 1; i++)
                arr[i] = arr[i + 1];
            arr[n - 1] = first;
        }

        for (int x : arr)
            System.out.print(x + " ");
    }
}