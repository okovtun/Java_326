//Loop
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        /*int i = 0;      //счетчик цикла
        System.out.print("Введите количество итераций: ");
        int n = kb.nextInt();
        while(++i < n)
        {
            System.out.println("%d - Hello".formatted(i));
            //i++;
        }*/

        /*int value;
        int sum = 0;
        System.out.print("Введите значения для суммирования (для завершения введите 0): ");
        do {
            value = kb.nextInt();
            sum += value;
        }while(value != 0);
        System.out.println("Сумма введенных значений: " + sum);*/

        /*String integer;
        do {
            System.out.print("Введите целое число: ");
            integer = kb.next();
            if(integer.indexOf('.') != -1 || integer.indexOf(',') != -1) System.out.println("Вы ввели дробное число, нужно ввести целое число");
        }while(integer.indexOf('.') != -1 || integer.indexOf('.') != -1);
        System.out.println(integer);*/

        /*System.out.print("Введите количество итераций: ");
        int n = kb.nextInt();
        for(int i = 0; i < n; i++)
        {
            System.out.print(i + "\t");
        }
        System.out.println();*/

        /*System.out.print("Введите предельное число: ");
        int n = kb.nextInt();
        for(long i=0, a=0, b=1, c=a+b; i<n; i++, a=b, b=c, c=a+b)
        {
            if(i%7 == 0) System.out.println();
            System.out.printf("%-18d\t", a);
        }
        System.out.println();*/
        //Arithmetical overflow

        System.out.print("Введите предельно число");
        int n=kb.nextInt();
        for(int i = 0, counter=0; i < n; i++)
        {
            if(counter == 10)
            {
                System.out.println();
                counter=0;
            }
            Boolean simple = true; //Предположим что число простое,
            //НО, это нужно проверить:
            for(int j = 2; j < i/2; j++)
            {
                if(i % j == 0)
                {
                    simple = false;
                    break;      //Прерывает текущую итерацию, и все последующие
                    //continue;   //Прерывает текущую итерацию, и переходит к следующей
                }
            }
            if(simple)
            {
                System.out.printf("%-5d\t", i);
                counter++;
            }
        }
        //System.out.println();
    }
}

/*
    while - цикл с предусловием
    do...while - цикл с постусловием
    for - цикл на заданное число итераций
    Итерация - это однократное выполнение тела цикла.
    Тело цикла - это код, который нужно многократно выполнить.
 */