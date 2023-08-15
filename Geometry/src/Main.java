import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Введите размер фигуры: ");
        int n = kb.nextInt();
//
        /*for(int i = 0; i < n; i++)  //Этот цикл повторяет вывод строки на экран
        {
            for (int j = 0; j < n; j++) //Этот цикл повторяет вывод звездочки на экран
            {
                System.out.print("* ");
            }
            System.out.println();   //После вывода строки нужно перейти на новую строку
        }*/

        /*for(int i = 0; i < n; i++)
        {
            for(int j = 0; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }*/
    }
}