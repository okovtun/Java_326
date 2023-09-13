import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

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
                arr[i][j] = rand.nextInt(rows*cols);
            }
        }
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("Количество строк: " + arr.length);
        System.out.println("Количество элементов строки: " + arr[0].length);
        for (int i1 = 0; i1 < rows; i1++) {
            for (int j1 = 0; j1 < cols; j1++) {
                arr[i1][j1]=rand.nextInt(rows*cols);
                boolean met_before = false;
                for (int i2 = 0; i2 < rows; i2++) {
                    for (int j2 = 0; j2 < cols; j2++) {
                        if (arr[i1][j1] == arr[i2][j2]) {
                            //i1--;
                            j1--;
                            met_before=true;
                            break;
                        }
                    }
                    if(met_before)break;
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}