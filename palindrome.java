import java.util.Scanner;
class palindrome
{
    public static void main(String[] args) {
        int n,sum=0;
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int c = n;
        while(n>0)

            {
                int rem = n%10;
                sum = (sum*10)+rem;
                n=n/10; 
            }

            if(c==sum)
            {
                System.out.println("The number is a palindrome");
            }
            else
            {
                System.out.println("The number is not a palindrome");
            }


        
    }
}