public class Car extends GroundVehile
{
    @Override
    public void move()
    {
        System.out.println("Машина ехала, колеса терлися......");
    }

    @Override
    public String toString() {
        move();
        return super.toString();
    }
}
