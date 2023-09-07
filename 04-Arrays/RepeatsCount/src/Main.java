
import java.util.Random;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int n = 20;
        int[] arr = new int[n];
        Random rand = new Random(0);
        for(int i = 0; i < n; i++)
        {
            arr[i] = rand.nextInt(5);
        }
        System.out.println(Arrays.toString(arr));

        for(int i = 0; i < n; i++)
        {
            //Прежде чем чситать повторения нужно выянить,
            //встречался ли этот элемент в массиве ранее.
            boolean met_before = false;
            for(int j = 0; j < i; j++)
            {
                if(arr[i] == arr[j])
                {
                    met_before = true;
                    break;
                }
            }
            if(met_before)continue; //если элемент встречался ранее,
            // то мы уже посчитали для него количество повторений, и вывели их на экран.
            //---------------------------------------
            //Если же выбранное значение ранее НЕ встречалось, то нужно посчитать для него
            //количество повторений:
            int count = 0;
            for(int j = i+1; j < n; j++)
            {
                if(arr[i] == arr[j])count++;
            }
            if(count > 0) System.out.println("Значение %d повторяется %d раз".formatted(arr[i], count));
        }
    }
}