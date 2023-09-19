import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Введите два числа: ");
        int a = kb.nextInt();
        int b = kb.nextInt();

        int c = Sum(a, b);
        System.out.println("%d + %d = %d".formatted(a, b, c));
        System.out.println("%d - %d = %d".formatted(a, b, Diff(a, b)));
        System.out.println("%d * %d = %d".formatted(a, b, Prod(a, b)));
        System.out.println("%d / %d = %f".formatted(a, b, Quot(a, b)));
        System.out.println("%f ^ %d = %f".formatted((double)a, b, Power(a, b)));

        System.out.print("Введите число: ");
        int n = kb.nextInt();
        System.out.println("%d! = %d".formatted( n, Factorial(n)));
    }
    static int Sum(int a, int b)
    {
        //Sum - Сумма
        int c = a + b;
        return c;
    }
    static int Diff(int a, int b)
    {
        //Difference - Разность
        return a - b;
    }
    static int Prod(int a, int b)
    {
        //Product - Произведение
        return a * b;
    }
    static double Quot(int a, int b)
    {
        //Quotient - Частное
        return (double)a / b;
    }
    static int Factorial(int n)
    {
        int f = 1;
        for(int i = 1; i <= n; i++)
        {
            f *= i;
        }
        return f;
    }

    static double Power(double a, int n)
    {
        double N = 1;
        if(n < 0)
        {
            a = 1/a;
            n = -n;
        }
        for(int i = 0; i < n; i++)
        {
            N *= a;
        }
        return N;
    }
}