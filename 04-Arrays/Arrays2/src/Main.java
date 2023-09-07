import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Введите количество строк: ");
        int rows = kb.nextInt();
        System.out.print("Введите количество элементов строки: ");
        int cols = kb.nextInt();

        int[][] arr = new int[rows][cols];

        Random rand = new Random(0);
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                arr[i][j] = rand.nextInt(100);
            }
        }
        System.out.println("Количество строк: " + arr.length);
        System.out.println("Количество элементов строки: " + arr[0].length);
        for(int  i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}