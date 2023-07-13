
public class Main {
    public static void main(String[] args) {
       /*
       I) Arithmetical operators:
            Unary: +, -;
            Binary:+, -, *, /, %;
                   %  - остаток от деления
        */
        System.out.println(17./3);
        System.out.println(17.%3);
        System.out.println(3%17.);

        /*
        II) Assignment operator =
            l-value = r-value;
        */
        int a = 2;
        int b = 3;
        int c = a + b;
    }
}