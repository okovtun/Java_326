import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //System.out.println("Hello world!");
        Scanner kb = new Scanner(System.in);
        Random rand = new Random(0);
        System.out.print("Введите размер массива: ");
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = rand.nextInt(100);
        }
        for(int i : arr)System.out.print(i + "\t");System.out.println();
        System.out.print("Введите добавляемое значение: ");
        int value = kb.nextInt();
        System.out.print("Введиите количество добавляемых значений:");
        int count = kb.nextInt();
        long start_time = System.nanoTime();
//        long start_time = System.currentTimeMillis();
        for(int i = 0; i < count; i++)
        {
            arr = Array.push_back(arr, value);
        }
        long end_time = System.nanoTime();
//        long end_time = System.currentTimeMillis();
        System.out.println("Элемент добавлен за %f секунд.".formatted((double)(end_time-start_time)*1e-9));
        //for(int i : arr)System.out.print(i + "\t");System.out.println();
    }
}