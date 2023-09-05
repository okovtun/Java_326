import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Введите десятичное число:");
        int decimal = kb.nextInt();
        int[] bin = new int[32];
        int i = 0;  //счетчик разрядов
        /*while(decimal > 0)
        {
            bin[i++] = decimal % 2;
            decimal /= 2;   //decimal = decimal / 2;
            //i++;
        }*/
        for(; decimal > 0; decimal /= 2)
            bin[i++] = decimal % 2;
        //System.out.println(Arrays.toString(bin));
        //i--;    //Максимальный номер разряда на 1 меньше количества
        for(--i; i >= 0; i--)
        {
            System.out.print(bin[i]);
        }
    }
}