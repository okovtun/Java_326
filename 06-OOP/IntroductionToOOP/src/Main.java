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
        System.out.println("X = " + A.getX());
        System.out.println("Y = " + A.getY());
        //Object
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
}