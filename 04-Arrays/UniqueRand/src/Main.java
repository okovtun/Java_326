import java.util.Arrays;
import java.util.Random;

// UniqueRand
public class Main {
    public static void main(String[] args) {
        int n = 10;
        int[] arr = new int[n];
        Random rand = new Random(0);
       /* for(int i = 0; i < n; i++)
        {
            boolean unique;    //флаг уникальности
            do
            {
                arr[i] = rand.nextInt(n);
                unique = true;  //Предположим, что сгенерировалось уникальное случайное число,
                //но это нужно проверить:
                for(int j = 0; j < i; j++)
                {
                    if(arr[i] == arr[j])
                    {
                        unique = false;
                        break;
                    }
                }
            }while (!unique);
        }*/

        for(int i = 0; i < n; i++)
        {
            arr[i] = rand.nextInt(n);
            for(int j = 0; j < i; j++)
            {
                if(arr[i] == arr[j])
                {
                    i--;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}