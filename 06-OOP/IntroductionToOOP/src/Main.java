public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int a;                  //Объявление переменной 'a' типа 'int'
        Point A = new Point();  //Объявление переменной 'A' типа 'Point'
                                //Создание объекта (экземпляра) 'A' класса 'Point'
        //A.x = 2;
        //A.y = 3;
        A.setX(2);
        A.setY(3);
//        System.out.println("X = " + A.getX());
//        System.out.println("Y = " + A.getY());
        //Object
        A.print();

        Point B = new Point();
        B.setX(7);
        B.setY(8);
        //System.out.println("X = %f, Y = %f".formatted(B.getX(), B.getY()));
        B.print();

        System.out.println("Расстояние от точки 'A' до точки 'B': %f".formatted(A.distance(B)));
        System.out.println("Расстояние от точки 'B' до точки 'A': %f".formatted(B.distance(A)));
        System.out.println("Расстояние между точками 'A' и 'B': %f".formatted(Point.distance(A, B)));
        System.out.println("Расстояние между точками 'B' и 'A': %f".formatted(Point.distance(B, A)));

        Point C;    //null
        C = new Point();    //явно вызываем конструктор, создаем объект, и записываем адрес этого объекта в ссылку 'C'
        C.print();

        Point D = new Point(5);
        D.print();

        Point E = new Point(22,33);
        E.print();
        E.toString();
        System.out.println(E.toString());
        Object obj = new Object();
        System.out.println(obj);

        Point G = new Point(E);
        System.out.println(G);
    }
}
class Point
{
    private double x;
    private double y;
    public double getX()
    {
        return x;
    }
    public double getY()
    {
        return y;
    }
    public void setX(double x)
    {
        this.x = x;
    }
    public void setY(double y)
    {
        this.y = y;
    }

    //                  Constructors:
    public Point()
    {
        System.out.println("DefaultConstructor:\t" + this.hashCode());
    }
    public Point(double x)
    {
        setX(x);
        setY(x);
        System.out.println("1ArgConstructor:\t" + this.hashCode());
    }
    public Point(double x, double y)
    {
        setX(x);
        setY(y);
        System.out.println("Constructor:\t\t"+this.hashCode());
    }
    public Point(Point other)
    {
        this.x = other.x;
        this.y = other.y;
        System.out.println("CopyConstructor:\t" + Integer.toHexString(this.hashCode()));
    }

    //                  Methods:
    public double distance(Point other)
    {
        //this
        //other
        double x_distance = this.x - other.x;
        double y_distance = this.y - other.y;
        double distance = Math.sqrt(x_distance*x_distance + y_distance*y_distance);
        //Math - это встроенный класс, который содержит математические методы (функции)
        //SQRT - Square Root (Квадратный корень)
        return distance;
    }
    public static double distance(Point A, Point B)
    {
        /*double x_distance = A.x - B.x;
        double y_distance = A.y - B.y;
        double distance = Math.sqrt(x_distance*x_distance + y_distance*y_distance);
        return distance;*/
        return Math.sqrt(Math.pow(A.x - B.x, 2) + Math.pow(A.y - B.y, 2));
    }
    public void print()
    {
        System.out.println("X = %f, Y = %f".formatted(x, y));
    }
    public String toString(){ return "X = %f, Y = %f".formatted(x, y); }
}

/*
type name ( parameters )
{
    ........;
    group-of-statements;
    ........;
}
*/

/*
---------------------------------------------------
Constructor - это метод, который создает объект.
Конструктор выделяет память под объект, и инициализирует его поля во время создания.
Конструкторы бывают:
    - с параметрами;
    - без параметров;
    - конмтруктор по умолчанию;
    - контруктор копирования;

Конструктор по умолчанию - это конструктор, который может быть вызван без параметров.
Значения по умолчанию:
    - у числовых типов - это '0';
    - у boolean - это 'false';
    - у ссылочных типов - это 'null';

CopyConstructor - это конструктор который копирует объект
---------------------------------------------------
*/