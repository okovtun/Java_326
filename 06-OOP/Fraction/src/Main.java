public class Main {
    public static void main(String[] args)
    {
        //System.out.println("Hello world!");
        /*Fraction A = new Fraction();
        A.print();
        System.out.println(A.getDenominator());

        Fraction B = new Fraction(5);
        B.print();

        Fraction C = new Fraction(1,2);
        C.print();

        Fraction D = new Fraction(2, 3, 4);
        D.print();

        Fraction E = new Fraction(D);
        E.print();*/
        Object obj;

        //int a = 2;
        //System.out.println(a);

        Fraction A = new Fraction(2,3,4);
        Fraction B = new Fraction(3,4,5);

        /*double a = 2.75;
        double b = 3.8;
        double c = a + b;   //+ - оператор "сложить" (возвращает сумму двух чисел)
        System.out.println(c);
        a += b; //+= - оператор "прибавить" (к левой операнде прибавляет правую операнду)
        System.out.println(a);*/

        Fraction C = Fraction.add(A, B);
        A.print();
        B.print();
        C.print();
        //System.out.println(C);
    }
}