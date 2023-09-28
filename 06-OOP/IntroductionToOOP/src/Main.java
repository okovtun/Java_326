public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int a;                  //Объявление переменной 'a' типа 'int'
        Point A = new Point();  //Объявление переменной 'A' типа 'Point'
                                //Создание объекта (экземпляра) 'A' класса 'Point'
        A.x = 2;
        A.y = 3;
        System.out.println("X = " + A.x);
        System.out.println("Y = " + A.y);
        //Object
    }
}
class Point
{
    private double x;
    private double y;
}