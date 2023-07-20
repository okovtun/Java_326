import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       /*
       I) Arithmetical operators:
            Unary: +, -;
            Binary:+, -, *, /, %;
                   %  - остаток от деления
        */
//        System.out.println(17./3);
//        System.out.println(17.%3);
//        System.out.println(3%17.);

        /*
        II) Assignment operator =
            l-value = r-value;
        */
//        int a = 2;
//        int b = 3;
//        int c = a + b;

        /*
        III) Increment/Decrement (++/--)
        Increment (++) - это унарный оператор, который увеличивает значение переменной на 1.
        Decrement (--) - это унарный оператор, который уменьшает значение переменной на 1.
        Префиксная
        Постфиксная (Суфиксная)
         */
//        int i=0;
//        ++i;    //Prefix increment
//        //System.out.println(i);
//        i++;    //Postfix increment
//        //System.out.println(i);
//        --i;    //Prefix decrement
//        //System.out.println(i);
//        i--;    //Postfix (Suffix) decrement
//        //System.out.println(i);
//        //i == 0
//        int j = ++i;
//        System.out.println(i);
//        System.out.println(j);

        /*
        IV) Составные присваивания (Compound assignments)
        assign - присвоить
        assignment - присваивание
         */

       /* int a = 2, b = 3;
        System.out.printf("%d \t %d\n", a, b);
        //a = a + b;
        a += b;
        System.out.printf("%d \t %d\n", a, b);*/
        //  'Ctrl' + '/' - строчный комментарий.
        /*
            'Ctrl' + 'Shift' + '/' - блочный комментарий.
         */

       /* int a, b, c;
        a = b = c = 7;
        System.out.printf("%d\t%d\t%d\t\n", a, b, c);
        a + b + c;*/

        /*Scanner kb = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = kb.nextInt();
        System.out.print("Введите строку: ");
        kb.nextLine();
        String str = kb.nextLine();
        System.out.printf("Число: %d, Строка: %s", a, str);*/

        /*
        V) Операторы сравнения (Comparison operators)
         */
       /* System.out.println(!true == false);
        System.out.println(true && true && true);
        int t = 20;
        Boolean rain = false;
        if(t>10 && !rain)
        //        NOT rain
        {
            System.out.println("Идем гулять");
        }
        else
        {
            System.out.println("Сидим дома");
        }*/
        int i=3;
        i = i++ + 1 + (i *= 2);
        System.out.println(i);
    }
}