import org.w3c.dom.ls.LSOutput;

import java.lang.Number;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final String delimiter = "\n-------------------------------------------\n";


        // System.out.println("Hello and welcome!");    //вывод на экран
        //1. Для комментирования своих действий в коде
        //2. Для временного отключения некоторых фрагментов кода, без удаления этого кода

        //Строчный комментарий - после //игнорируются все символы строки до конца строки
        /* - начало блочного комментария
            Блочный комментарий, у которого есть начало и конец,
            и он позволяет закомментировать несколько строк кода
            или же часть строки кода.
        конец блочного комментария */
        //System.out.println("Hello" + " " + "World");

        //Переменная (Variable) - это именованная область памяти, содержимое которой
        //                        может изменяться в процессе выполнения программы.

        //                      type name;      //синтаксис объявления переменной
        //type - тип переменной, определяет три вещи:
        //1. Сколько памяти переменная будет занимать;
        //2. Какие значения она сможет принимать;
        //3. Какие операции над ней можно выполнять;

        //I - Логические типы: bool (Boolean)
        //True  1
        //False 0

       /* System.out.println(true);
        System.out.println(false);
        System.out.println(Boolean.TRUE);
        System.out.println(Boolean.FALSE);
        System.out.println(Boolean.TYPE);*/
        //*/

        //II - Символьные типы: char (Character - Символ)
        //System.out.println(Character.SIZE);//Unicode 65536
        //System.out.println(Character.BYTES);//Unicode 65536
        System.out.printf("----------------------------------------------------\n");
        //III - Числовые типы
        //unsigned (беззнаковые) - предназначены для хранения только положительных целых чисел
        //  signed (знаковые) - могут хранить как положительные, так и отрицательные целые числа
        //  byte
        //  short   16 bit
        //  int     32 bit
        //  long    64 bit
        /*System.out.println(Byte.SIZE);
        System.out.println(Byte.BYTES);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println();

        System.out.println(delimiter);*/

        //System.out.println("Hello" + "World");    //Конкатенация строк
//        System.out.println("Переменная типа " + "int" + " занимает " +
//                        Integer.BYTES + " Байт памяти (" + Integer.SIZE + " бит памяти)," +
//                        "и принимает значения в диапазоне от" +
//                        Integer.MIN_VALUE + " до " + Integer.MAX_VALUE);
        /*System.out.println("Переменная типа %-6s занимает %d Байт памяти (%-3d бит памяти), и принимает значения в диапазоне от %d до %d".formatted("byte", Byte.BYTES, Byte.SIZE,Byte.MIN_VALUE, Byte.MAX_VALUE));
        System.out.println("Переменная типа %-6s занимает %d Байт памяти (%-3d бит памяти), и принимает значения в диапазоне от %d до %d".formatted("short", Short.BYTES, Short.SIZE, Short.MIN_VALUE, Short.MAX_VALUE));
        System.out.println("Переменная типа %-6s занимает %d Байт памяти (%-3d бит памяти), и принимает значения в диапазоне от %d до %d".formatted("int", Integer.BYTES, Integer.SIZE, Integer.MIN_VALUE, Integer.MAX_VALUE));
        System.out.format("Переменная типа %-6s занимает %d Байт памяти (%-3d бит памяти), и принимает значения в диапазоне от %d до %d", "long", Long.BYTES, Long.SIZE, Long.MIN_VALUE, Long.MAX_VALUE);
        System.out.println(delimiter);
        System.out.format("Переменная типа %-6s занимает %d Байт памяти (%-3d бит памяти), и принимает значения в диапазоне от %e до %e\n", "float", Float.BYTES, Float.SIZE, Float.MIN_VALUE, Float.MAX_VALUE);
        System.out.format("Переменная типа %-6s занимает %d Байт памяти (%-3d бит памяти), и принимает значения в диапазоне от %e до %e\n", "double", Double.BYTES, Double.SIZE, Double.MIN_VALUE, Double.MAX_VALUE);
        System.out.println(38e-4);
        final double d = 12.56f;*/
        //System.out.println(d);

/*
        //0) Создаем сканер, при помощи которого будем вводить данные с клавиатуры:
        Scanner kb = new Scanner(System.in);
        //System.out.print("Введите целое число: ");
        //int num = kb.nextInt();
        //System.out.print("Введите строку: ");
        //String str = kb.nextLine();
        //System.out.println(str + " " + num);
        //1) Объявляем переменную, в которую будет вводиться денежная сумма:
        double money;
        //2) Перед вводом пользователь обзательно должен увидеть приглашение на ввод:
        System.out.print("Введите сумму: ");
        //3) Обеспечиваем ввод значения пользователем с клавиатуры:
        money = kb.nextDouble();
        money += 1e-15;    //прибавляем 1*10^-5, чтобы скорректировать число в периоде
        //4) Проверяем ввод:
        System.out.println(money);
        //5) Разделение числа:
        int rub = (int)money;   //явно преобразуем переменную 'money' в тип 'int'
        int cop = (int)((money-rub)*100);
        System.out.printf("С Вас %d грн., %d коп.\n", rub, cop);
        int For;

 */
        /*
        * 1. ABC...Zabc...z012...9_$;
        * 2.
        * 3. Имена переменных регистрозависимы;
        * 4. Для именования переменных нельзя испольщовать ключевые слова языка Java;
        * */

        /*int a = 2;  //Init - Начало.
        int b=3;
        System.out.println(b);
        double b;*/

        int speed=0;
        final int MAX_SPEED = 250;
        speed = 60;
        //MAX_SPEED=300;

        System.out.println(((Object)512).getClass().getSimpleName());
        System.out.println(((Object)512L).getClass().getSimpleName());
        System.out.println(((Object).512).getClass().getSimpleName());
        System.out.println(speed*.512);
        System.out.println(((Object)speed).getClass().getSimpleName());
        System.out.println(((Object)'+').getClass().getSimpleName());
        System.out.println('+');

    }
}