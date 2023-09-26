import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.print("Hello world!");
        //main(null);

        Scanner kb = new Scanner(System.in);
        /*System.out.print("Введите номер этажа: ");
        int floor = kb.nextInt();
        Elevator(floor);*/

        /*System.out.print("Введите число для вычисления факториала: ");
        int n = kb.nextInt();
        for(int i = 0; i <= n; i++)
            System.out.printf("%d! = %e\n", i, Factorial(i));*/

        /*System.out.print("Введите основание степени: ");
        int a = kb.nextInt();
        System.out.print("Введите показатель степени: ");
        int n = kb.nextInt();
        System.out.print("%d ^ %d = %f".formatted(a, n, Power(a, n)));*/

        System.out.println("Введите предельное число");
        int n = kb.nextInt();
        Fibonacci(n, 0, 1);
    }

    static void Fibonacci(long n, long a, long b)
    {
        if(a > n)return;
        System.out.print(a + "\t");
        Fibonacci(n, b, a + b);
    }
    static double Power(double a, int n)
    {
        /*if(n == 0)return 1;
        else if( n > 0 ) return a * Power(a,n-1);
        else return 1 / a*Power(a, n + 1);*/
        //return n == 0 ? 1 : n > 0 ? a * Power(a, n-1) : 1 / a * Power(a, n + 1);
        return n == 0 ? 1 : n > 0 ? a * Power(a, n-1) : 1 / Power(a, -n);
        //return n == 0 ? 1 : n > 0 ? a * Power(a, n-1) : 1 / Power(a, Math.abs(n));
    }
    static double Factorial(int n)
    {
        /*if(n < 0)return 0;
        if(n == 0)return 1;
        else return n*Factorial(n-1);*/
        return n < 0 ? 0 : n == 1 ? 1 : n*Factorial(n - 1);
    }
    static void Elevator(int floor)
    {
        if(floor == 0)
        {
            System.out.println("Вы в подвале");
            return;
        }
        System.out.println("Вы на " + floor + " этаже");
        Elevator(floor-1);
        System.out.println("Вы на " + floor + " этаже");
    }
}

//Stack
//Stack overflow exception