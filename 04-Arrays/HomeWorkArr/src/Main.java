package HomeWork;
import java.util.Scanner;
import java.util.Arrays;
public class HomeWork15 {
    public static void main(String[] args) {
        int sum = 0;
        int min;
        int max = 0;
        /////////////////////////////////////////////////////
        Scanner input = new Scanner(System.in);
        System.out.print("1. Введите размер массива: ");
        int n = input.nextInt();
        int[]array = new int[n];
        /////////////////////////////////////////////////////
        for(int i = 0; i < array.length; i++){
            System.out.printf("   Введите элемент массива индекса %d : ",i);
            array[i] = input.nextInt();
            sum += array[i];  //  Сумма массива
            if(max < array[i]){ max = array[i];} // Максимальное значение
        }//i < array.length
        ////////////////////////////////////////////////////////
        min = array[0];
        for(int j = 0; j < array.length; j++ ) {
            if(min > array[j]) min = array[j]; // Минимальное значение
        }
        ///////////////////////////////////////////////////////
        System.out.print("2. Вы ввели: ");
        for(int num : array){   // Вывод на экран введенный массив через переменную num
            System.out.print(num+" ");
        }//num : array
        System.out.print("\n   Массив: "+ Arrays.toString(array)); // вывод массива через toString
        ///////////////////////////////////////////////////////////
        for(int r = 0; r < array.length / 2; r++ ){  //делим массив
            int init = array[r];                     // присваиваем переменной init значение из 0-го индекса массива
            array[r]=array[array.length - r - 1];    // в 0-ой индекс помещаем значение последнего индекса массива
            array[array.length - r - 1] = init;     //в последний индекс массива помещаем значение переменной
        }//r < array.length / 2
        ////////////////////////////////////////////////////////////
        System.out.printf("\n3. элементы массива от конца к началу: %S",Arrays.toString(array));
        System.out.printf("\n4. Сумма элементов массива: %d",sum);
        System.out.printf("\n5. Среднеe-арифметическое элементов массива: %d",(sum/n));// среднее-арифметическое элементов массива
        System.out.printf("\n6. МиНимальное значение массива: %d \n   МаКсимальное значение массива: %d",min,max);
    }
}