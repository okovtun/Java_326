import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Array
        //Reference -
        Scanner kb = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = kb.nextInt();
        int[] arr = new int[n];
        arr[2] = 1024;      //обращение к элементу массива на запись
        System.out.println(arr[2]); //обращение к элементу массива на чтение
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

        int[] fib = new int[]{ 3, 5, 8, 13, 21 };
        for(int i = 0; i < fib.length; i++)
        {
            System.out.print(fib[i] + "\t");
        }
        System.out.println();
    }
}