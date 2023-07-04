public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");    //вывод на экран
        //1. Для комментирования своих действий в коде
        //2. Для временного отключения некоторых фрагментов кода, без удаления этого кода

        //Строчный комментарий - после //игнорируются все символы строки до конца строки
        /* - начало блочного комментария
            Блочный комментарий, у которого есть начало и конец,
            и он позволяет закомментировать несколько строк кода
            или же часть строки кода.
        конец блочного комментария */
        System.out.println("Hello" + " " + "World");

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
        /*
        System.out.println(true);
        System.out.println(false);
        System.out.println(Boolean.TRUE);
        System.out.println(Boolean.FALSE);
        System.out.println(Boolean.TYPE);
        */

        //II - Символьные типы: char (Character - Символ)
        System.out.println(Character.SIZE);//Unicode 65536
        System.out.println(Character.BYTES);//Unicode 65536
        System.out.printf("----------------------------------------------------");
        //III - Числовые типы
        //unsigned (беззнаковые) - предназначены для хранения только положительных целых чисел
        //  signed (знаковые) - могут хранить как положительные, так и отрицательные целые числа
        //  byte
        //  short   16 bit
        //  int     32 bit
        //  long    64 bit
        System.out.println(Byte.SIZE);
        System.out.println(Byte.BYTES);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println();
    }
}