public class Plane extends AirVehicle
{
    @Override
    public void move()
    {
        System.out.println("Заходим на взлет");
    }

    @Override
    public void top_up() {
        System.out.println("Разгоняемся на взлетной полосе, и взлетаем");
    }

    @Override
    public void fly() {
        System.out.println("Летим на большей высоте с большой скоростью");
    }

    @Override
    public void land() {
        System.out.println("Заходим на посадку");
    }

    @Override
    public String toString() {
        move();
        top_up();
        fly();;
        land();;
        return super.toString();
    }
}
