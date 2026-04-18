import java .util.Scanner;
class armstrong
{
    public static void main(String[] args) {
        int n,rev=0,rem;
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int c = n;
        while(n>0)
        {
            rem=n%10;
            rev = (rem*rem*rem) + rev;
            n=n/10;
        }

        if(c==rev)
        {
            System.out.println("The number is an armstrong number");
        }
        else
        {
            System.out.println("The number is not an armstrong number");
        }

    }
}